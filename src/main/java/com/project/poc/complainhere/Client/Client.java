package com.project.poc.complainhere.Client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.project.poc.complainhere.Enterprise.Enterprise;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "CLIENTS_TABLE")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private UUID uuid;
    private String name;
    private String email;

    private String dateOfBirth; //LocalDate

    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnoreProperties("client")
    private Enterprise enterprise;
}
