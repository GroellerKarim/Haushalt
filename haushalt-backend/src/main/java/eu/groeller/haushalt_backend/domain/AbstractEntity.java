package eu.groeller.haushalt_backend.domain;

import jakarta.persistence.*;

import java.util.UUID;


@Entity
public class AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    protected UUID id;

    @Version
    private Integer version = 0;

}
