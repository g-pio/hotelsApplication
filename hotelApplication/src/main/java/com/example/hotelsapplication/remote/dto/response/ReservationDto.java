package com.example.hotelsapplication.remote.dto.response;

import com.example.hotelsapplication.domain.ReservationStatus;
import com.example.hotelsapplication.remote.dto.common.PersonDto;
import com.example.hotelsapplication.remote.dto.common.RoomInfoDto;

import java.util.List;

public class ReservationDto {
    private Integer id;
    private ReservationStatus status;
    private List<RoomInfoDto> hotels;
    private PersonDto person;

    public ReservationDto() {
    }

    public ReservationDto(Integer id, ReservationStatus status, List<RoomInfoDto> hotels, PersonDto person) {
        this.id = id;
        this.status = status;
        this.hotels = hotels;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public ReservationStatus getStatus() {
        return status;
    }

    public List<RoomInfoDto> getHotels() {
        return hotels;
    }

    public PersonDto getPerson() {
        return person;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }

    public void setHotels(List<RoomInfoDto> hotels) {
        this.hotels = hotels;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }
}
