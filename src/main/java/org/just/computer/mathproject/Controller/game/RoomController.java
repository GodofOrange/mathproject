package org.just.computer.mathproject.Controller.game;

import org.just.computer.mathproject.Bean.Room;
import org.just.computer.mathproject.Bean.WebSocketInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import static org.just.computer.mathproject.Bean.WebSocketInfo.roomList;


@Controller
public class RoomController {
    /**
     * 开房
     * @param pl
     * @return
     */
    @GetMapping("/createRoom")
    @ResponseBody
    public Integer CreateRoom(Principal pl){
        String customer = pl.getName();
        Room room = new Room();
        ArrayList list = new ArrayList();
        list.add(customer);
        room.setCusmtomers(list);
        room.setRoomId(roomList.size());
        room.setRoomName(customer+"的房间");
        roomList.add(room);
        return room.getRoomId();
    }
    /**
     * 根据房间ID加入房间
     */
    @GetMapping("/joinRoom")
    @ResponseBody
    public boolean JoinRoom(Principal pl,Integer id){
        if(roomList.size()>=id&& roomList.get(id)!=null&& roomList.get(id).getCusmtomers().size()==1){
            roomList.get(id).getCusmtomers().add(pl.getName());
            return true;
        }else return false;
    }
    /**
     * 离开房间
     */
    @GetMapping("/leaveRoom")
    @ResponseBody
    public boolean leaveRoom(Principal pl,Integer id){
        roomList.get(id).getCusmtomers().remove(pl.getName());
        return true;
    }
    /**
     * 获取对方信息
     */
    @GetMapping("/getMessage")
    @ResponseBody
    public List<String> getMessage(Integer id){
        return roomList.get(id).getCusmtomers();
    }
}
