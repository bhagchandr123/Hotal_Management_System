package com.example.Hotel_Management.controller;

import com.example.Hotel_Management.model.Room;
import com.example.Hotel_Management.repository.IRoomRepository;
import com.example.Hotel_Management.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoomController {

    @Autowired
    RoomService roomService;

    //post api

    @PostMapping("/room")
    public String addRoom(@RequestBody Room newRoom){
        return roomService.addRoom(newRoom);
    }

   //add multiple rooms at once
    @PostMapping("rooms")
    public String addRooms(@RequestBody List<Room> newRooms){
        return roomService.addRooms(newRooms);
   }

    // get api
    @GetMapping("/room")
    public List<Room> getRooms(){
        return roomService.getRooms();
    }

    @GetMapping("rooms/id/{id}")
    public  Room getRoomById(@PathVariable Integer id){
        return roomService.getRoomById(id);
    }
    @GetMapping("rooms/price/{price}")
    public List<Room> getRoomByPrice(@PathVariable double price) {
        return roomService.getRoomByPrice(price);
    }

    @GetMapping("rooms/price/{price}/And/available")
    public List<Room> getAvailableRoomsBelowsPrice(@PathVariable double price){
        return roomService.getAvailableRoomsBelowsPrice(price);
    }
    @GetMapping("rooms/price/{price}/or/available")
   public List<Room> getAvailableRoomsOrBelowPrice(@PathVariable double price) {
        return roomService.getAvailableRoomsOrBelowPrice(price);
    }

    @GetMapping("rooms/AC/or/available")
    public List<Room> getAvailableRoomsOrAcSortedByPrice() {
        return roomService.getAvailableRoomsOrAcSortedByPrice();
    }

    //delete
    @DeleteMapping("rooms/ids")
    public String removeRoomsByIds(@RequestBody List<Integer> ids){
        return roomService.removeRooms(ids);
    }
}
