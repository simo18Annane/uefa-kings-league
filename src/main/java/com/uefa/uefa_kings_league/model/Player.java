package com.uefa.uefa_kings_league.model;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "player")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "first_name")
    private String firstName;

    @Column(nullable = false, name = "last_name")
    private String lastName;

    @Column(nullable = false, name = "nationality")
    private String nationality;

    @Column(nullable = false, name = "birthday")
    private LocalDate birthday;

    @Column(nullable = false, name = "position")
    private String position;

    @Column(nullable = false, name = "shirt_number")
    private int shirtNumber;

}
