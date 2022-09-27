package com.example.eb2bpublicstockapi.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseDTO {
    private String itemNumber;
    private boolean obsolete;
    private String currentStock;
}
