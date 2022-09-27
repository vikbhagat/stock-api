package com.example.eb2bpublicstockapi.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestDTO {
    private LocationDTO location;
    private int[] itemNumber;
}
