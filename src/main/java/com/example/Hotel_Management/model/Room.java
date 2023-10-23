package com.example.Hotel_Management.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "OYO")

public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roomId;

    private Integer roomNumber;

    @Enumerated(EnumType.STRING)
    private Type roomType;

    @Column(name = "available")
    private boolean roomAvailable;

    private double roomPrice;

}
