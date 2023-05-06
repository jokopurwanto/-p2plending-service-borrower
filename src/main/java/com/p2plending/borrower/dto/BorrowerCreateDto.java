package com.p2plending.borrower.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@Data
@Builder
public class BorrowerCreateDto {

    @NotNull(message = "Invalid idUser: idUser is NULL")
    private Integer idUser;

    @NotNull(message = "Invalid firstName: firstName is NULL")
    private String firstName;

    @NotNull(message = "Invalid lastName: lastName is NULL")
    private String lastName;

    @NotNull(message = "Invalid email: email is NULL")
    private String email;

    @NotNull(message = "Invalid balance: balance is NULL")
    private Integer balance;

    @NotNull(message = "Invalid pin: pin is NULL")
    private Integer pin;
}
