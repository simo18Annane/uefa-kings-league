package com.uefa.uefa_kings_league.form;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TeamForm {

    @NotBlank
    private String teamName;
    @NotBlank
    private String teamCity;
    @NotBlank
    private String teamCountry;
    @NotBlank
    private LocalDate teamfoundation;
    @NotBlank
    private String teamStadium;
    @NotBlank
    private int teamTitle;

}
