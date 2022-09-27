package com.example.eb2bpublicstockapi.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseDTO {
    private String itemNumber;
    private LocationDTO location;
    private boolean available;
    private int currentStock;
}
