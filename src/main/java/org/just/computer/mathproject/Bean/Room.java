package org.just.computer.mathproject.Bean;

import java.util.ArrayList;

public class Room {
    /**
     * 房间名字
     */
    public String RoomName;
    /**
     * 房间ID
     */
    public Integer RoomId;
    /**
     * 房间用户
     */
    ArrayList<String> cusmtomers;

    public String getRoomName() {
        return RoomName;
    }

    public void setRoomName(String roomName) {
        RoomName = roomName;
    }

    public Integer getRoomId() {
        return RoomId;
    }

    public void setRoomId(Integer roomId) {
        RoomId = roomId;
    }

    public ArrayList<String> getCusmtomers() {
        return cusmtomers;
    }

    public void setCusmtomers(ArrayList<String> cusmtomers) {
        this.cusmtomers = cusmtomers;
    }
}
