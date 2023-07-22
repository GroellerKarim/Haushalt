package eu.groeller.haushalt_backend.domain;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "household")
public class Household extends AbstractEntity {

    @Column(nullable = false)
    private String name;
}
