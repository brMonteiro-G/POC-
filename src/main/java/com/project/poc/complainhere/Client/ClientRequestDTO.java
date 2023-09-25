package com.project.poc.complainhere.Client;

import com.project.poc.complainhere.Enterprise.Enterprise;
import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ClientRequestDTO {

    private String name;
    private String email;
    private Enterprise enterprise;
//    @JsonFormat(pattern="dd/MM/yyyy")
//    private LocalDate dateOfBirth;


}
