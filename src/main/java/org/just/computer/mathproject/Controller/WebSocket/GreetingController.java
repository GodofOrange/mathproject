package org.just.computer.mathproject.Controller.WebSocket;

import org.just.computer.mathproject.Bean.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.security.Principal;

@Controller
public class GreetingController {
    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Message greeting(String content, Principal pl) throws Exception{
        Message message = new Message();
        message.setContent(content);
        message.setName(pl.getName());
        return message;
    }
}
