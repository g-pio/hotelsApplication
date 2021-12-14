package com.example.hotelsapplication.remote.dto.request;

import com.example.hotelsapplication.remote.dto.common.PersonDto;
import com.example.hotelsapplication.remote.dto.common.RoomInfoDto;

import java.util.List;

public class ReservationListDto {
    private List<RoomInfoDto> hotels;
    private PersonDto person;

    public ReservationListDto() {
    }

    public ReservationListDto(List<RoomInfoDto> rooms, PersonDto person) {
        this.hotels = rooms;
        this.person = person;
    }

    public List<RoomInfoDto> getRooms() {
        return hotels;
    }

    public PersonDto getPerson() {
        return person;
    }

    public void setRooms(List<RoomInfoDto> rooms) {
        this.hotels = rooms;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }
}
