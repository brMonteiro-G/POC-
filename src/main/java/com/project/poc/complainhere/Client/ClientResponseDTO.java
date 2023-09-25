package com.project.poc.complainhere.Client;

import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClientResponseDTO {

    private String name;
    private String email;
    private String message;



    @Override
    public String toString() {
        return "{ \"name\" : \"" + this.name + "\", \"email\" : \"" + this.email + "\" }";
    }
}
