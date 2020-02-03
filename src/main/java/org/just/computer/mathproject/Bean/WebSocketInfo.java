package org.just.computer.mathproject.Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class WebSocketInfo {
    @Autowired
    SimpMessagingTemplate messagingTemplate;
    /**
     * 在线人数
     */
    public static int onLineNums = 0;
    /**
     * 房间列表
     */
    public static List<Room> roomList = new ArrayList<>();

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        messagingTemplate.convertAndSend("/topic/roomList",roomList);
    }
    @Scheduled(fixedRate = 500000)
    public void remove(){
        roomList = new ArrayList<>();
    }
}
