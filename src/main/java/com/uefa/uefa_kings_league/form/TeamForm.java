package com.uefa.uefa_kings_league.form;

import java.time.LocalDate;

import jakarta.validation.constraints.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TeamForm {

    @NotBlank //ne s'applique du'aux chaînes de caractères (String)
    private String teamName;
    @NotBlank
    private String teamCity;
    @NotBlank
    private String teamCountry;
    @NotNull
    private LocalDate teamFoundation;
    @NotBlank
    private String teamStadium;
    @Min(0)
    private int teamTitle;

}
