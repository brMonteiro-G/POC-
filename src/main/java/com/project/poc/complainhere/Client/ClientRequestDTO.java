package com.project.poc.complainhere.Client;

import com.project.poc.complainhere.Enterprise.Enterprise;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ClientRequestDTO {

    @NotNull(message = "name should not null")
    private String name;

    @Email(message = "Should be a valid email")
    @NotNull(message = "Email should not null")
    private String email;

    private Enterprise enterprise;

//    @JsonFormat(pattern="dd/MM/yyyy")
//    private LocalDate dateOfBirth;


}
