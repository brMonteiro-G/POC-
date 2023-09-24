package com.project.poc.complainhere.Client;

import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClientResponseDTO {

    private String name;
    private String email;
//    @JsonFormat(pattern="dd/MM/yyyy")
//    private LocalDate dateOfBirth;


    @Override
    public String toString() {
        return "{ \"name\" : \"" + this.name + "\", \"email\" : \"" + this.email + "\" }";
    }
}
