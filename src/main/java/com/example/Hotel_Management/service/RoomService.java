package com.example.Hotel_Management.service;

import com.example.Hotel_Management.model.Room;
import com.example.Hotel_Management.model.Type;
import com.example.Hotel_Management.repository.IRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.aspectj.lang.reflect.DeclareAnnotation.Kind.Type;

@Service
public class RoomService {

    @Autowired
    IRoomRepository roomRepository;

    public String addRoom(Room newRoom){
        roomRepository.save(newRoom);
        return "room added";
    }

    public List<Room> getRooms(){
        return (List<Room>) roomRepository.findAll();
    }

    public String addRooms(List<Room> newRooms) {
        roomRepository.saveAll(newRooms);
        return newRooms.size() + " rooms were added";

        }

    public Room getRoomById(Integer id) {
        return roomRepository.findById(id).get();
    }
    public String removeRooms(List<Integer> ids){
        roomRepository.deleteAllById(ids);
        return "removed rooms";
    }

    public List<Room> getRoomByPrice(double price) {
        return roomRepository.findByRoomPrice(price);
    }

    public List<Room> getAvailableRoomsBelowsPrice(double price) {
       return roomRepository.findByRoomPriceAndRoomAvailable(price,true);
      //  return roomRepository.findByRoomPrice(price);
    }

    public List<Room> getAvailableRoomsOrBelowPrice(double price){
        return roomRepository.findByRoomPriceOrRoomAvailable(price,true);
    }

    public List<Room> getAvailableRoomsOrAcSortedByPrice() {
     //  return roomRepository.findByRoomAvailableOrderByRoomPrice(com.example.Hotel_Management.model.Type.AC,true);
        return roomRepository.findByRoomAvailableAndRoomType(true, com.example.Hotel_Management.model.Type.AC);

    }
}

