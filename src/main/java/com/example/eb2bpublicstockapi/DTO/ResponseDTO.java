package com.example.eb2bpublicstockapi.DTO;

import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel
public class ResponseDTO {
    private String itemNumber;
    private boolean obsolete;
    private String availableQuantity;
    private String price;
    private String restockDate;
}
