package org.just.computer.mathproject.Controller.WebSocket;

import org.just.computer.mathproject.Bean.Chat;
import org.just.computer.mathproject.Bean.Message;
import org.just.computer.mathproject.Bean.Room;
import org.just.computer.mathproject.Bean.WebSocketInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import java.security.Principal;
import java.util.Date;

@Controller
public class GreetingController {
    @Autowired
    SimpMessagingTemplate messagingTemplate;
    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Message greeting(String content, Principal pl) throws Exception{
        Message message = new Message();
        message.setContent(content.substring(1,content.length()-1));
        message.setData(new Date().toString());
        message.setName(pl.getName());
        return message;
    }
    @MessageMapping("/chat")
    public void chat(Principal principal, Chat chat){
        String from = principal.getName();
        chat.setFrom(from);
        for(Room al : WebSocketInfo.roomList){
            if(al.getCusmtomers().contains(principal.getName())){
                if(al.getCusmtomers().size()==1) {
                    chat.setTo(al.getCusmtomers().get(0));
                    messagingTemplate.convertAndSendToUser(chat.getTo(), "/queue/chat", chat);
                }else if(al.getCusmtomers().size()==2){
                    chat.setTo(al.getCusmtomers().get(1));
                    messagingTemplate.convertAndSendToUser(chat.getTo(), "/queue/chat", chat);
                    chat.setTo(al.getCusmtomers().get(0));
                    messagingTemplate.convertAndSendToUser(chat.getTo(),"/queue/chat",chat);
                }
            }
        }
    }
}
