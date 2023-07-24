package eu.groeller.haushalt_backend.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "user_household")
public class UserHousehold extends AbstractEntity {

    @EmbeddedId
    private UserHouseholdCompositeKey compositeKey;

    @ManyToOne
    @MapsId("userId")
    private User user;

    @ManyToOne
    @MapsId("householdId")
    private Household household;

    @Column(nullable = false)
    private Boolean isUserAdmin;
    @Column(nullable = false)
    private Float shareInHousehold;
    @Column(nullable = false)
    private LocalDateTime joinedAt;

}
