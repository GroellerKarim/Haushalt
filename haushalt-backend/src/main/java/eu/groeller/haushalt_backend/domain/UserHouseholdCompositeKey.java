package eu.groeller.haushalt_backend.domain;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor

@Embeddable
public class UserHouseholdCompositeKey implements Serializable {

    private UUID householdId;
    private UUID userId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserHouseholdCompositeKey that)) return false;
        return Objects.equals(householdId, that.householdId) && Objects.equals(userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(householdId, userId);
    }
}
