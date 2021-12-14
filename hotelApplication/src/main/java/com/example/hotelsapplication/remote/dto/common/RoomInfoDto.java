package com.example.hotelsapplication.remote.dto.common;

public class RoomInfoDto {
    private Integer id;
    private Integer roomId;
    private Integer days;

    public RoomInfoDto() {
    }

    public RoomInfoDto(Integer id, Integer roomId, Integer days) {
        this.id = id;
        this.roomId = roomId;
        this.days = days;
    }

    public Integer getId() {
        return id;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public Integer getDays() {
        return days;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public void setDays(Integer days) {
        this.days = days;
    }
}
