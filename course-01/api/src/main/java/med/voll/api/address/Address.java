package med.voll.api.address;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Address {
    private String street;
    private String neighborhood;
    @Column(name = "zipcode")
    private String zipCode;
    private String city;
    private String state;
    private String number;
    private String complement;

    public Address(AddressData data) {
        this.street = data.street();
        this.neighborhood = data.neighborhood();
        this.zipCode = data.zipCode();
        this.city = data.city();
        this.state = data.state();
        this.number = data.number();
        this.complement = data.complement();
    }
}
