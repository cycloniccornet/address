package bachelor.address.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class DkAddressDTO implements Serializable {
    
    String floor;
    String door;
    int houseNr;
    String countryName;
    String countryCode;
    String streetDesignation;
    String streetName;
    String streetNumber;
    String roadCode;
    int postalCode;
    String cityName;
    String commune ;
    String region;

}
