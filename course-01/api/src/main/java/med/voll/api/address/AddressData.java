package med.voll.api.address;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;

public record AddressData(
        String street,
        String neighborhood,
        @JsonProperty("zipcode")
        @Column(name = "zipcode")
        String zipCode,
        String city,
        String state,
        String number,
        String complement

) {
}
