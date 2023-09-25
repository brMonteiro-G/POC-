package com.project.poc.complainhere.Enterprise;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.project.poc.complainhere.Client.Client;
import com.project.poc.complainhere.Enterprise.Category.EnumCategory;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "ENTERPRISES_TABLE")
public class Enterprise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private UUID uuid;

    private String name;

    @Enumerated(EnumType.STRING)
    private EnumCategory category;

    private Float score;

    @OneToMany(mappedBy = "enterprise" ,cascade = CascadeType.REMOVE)
    @JsonIgnoreProperties("enterprise")
    private List<Client> clients;

}
