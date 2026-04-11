package med.voll.api.address;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record AddressData(

        @NotBlank
        String street,

        @NotBlank
        String neighborhood,

        @JsonProperty("zipcode")
        @Column(name = "zipcode")
        @Pattern(regexp = "\\d{8}")
        @NotBlank
        String zipCode,

        @NotBlank
        String city,

        @NotBlank
        String state,

        String number,

        String complement

) {
}
