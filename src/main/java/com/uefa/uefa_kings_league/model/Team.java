package com.uefa.uefa_kings_league.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "team")
@Data //génére getters, setters, toString, equals, hashCode
@NoArgsConstructor //constructeur sans argument
@AllArgsConstructor //constructeur avec tous les champs
@Builder //pour faciliter la création d'objets avec builder pattern
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "name")
    private String name;

    @Column(nullable = false, name = "city")
    private String city;

    @Column(nullable = false, name = "country")
    private String country;

    @Column(nullable = false, name = "foundation")
    private LocalDate foundation;

    @Column(nullable = false, name = "stadium")
    private String stadium;

    @Column(nullable = false, name = "title")
    private int title;
}