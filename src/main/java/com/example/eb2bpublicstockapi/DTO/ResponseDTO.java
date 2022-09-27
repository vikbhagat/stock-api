package com.example.eb2bpublicstockapi.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseDTO {
    private String itemNumber;
    private String location;
    private boolean available;
    private boolean currentStock;
}
