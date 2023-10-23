package com.example.Hotel_Management.repository;

import com.example.Hotel_Management.model.Room;
import com.example.Hotel_Management.model.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IRoomRepository extends JpaRepository<Room,Integer> {

    List<Room> findByRoomPrice(double price);

    List<Room> findByRoomPriceAndRoomAvailable(double price, boolean b);

    List<Room> findByRoomPriceOrRoomAvailable(double price, boolean b);

    List<Room> findByRoomAvailableAndRoomType(boolean b, Type type);

}
