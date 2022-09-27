package com.example.eb2bpublicstockapi.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LocationDTO {
    private String locationName;
    private String street;
    private String postalCode;
    private String country;
    private String state;

}
