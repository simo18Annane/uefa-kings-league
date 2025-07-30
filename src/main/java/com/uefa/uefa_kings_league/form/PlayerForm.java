package com.uefa.uefa_kings_league.form;

import java.time.LocalDate;

import jakarta.validation.constraints.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlayerForm {

    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    @NotBlank
    private String nationality;
    @NotNull
    private LocalDate birthday;
    @NotBlank
    private String position;
    @Min(0)
    private int shirtNumber;

}
