package com.example.eb2bpublicstockapi.DTO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@ApiModel
public class ItemDTO {
    @ApiModelProperty(name = "Item Number", dataType = "String", example = "154742")
    private String itemNumber;
    @ApiModelProperty(name = "Requested Quantity", dataType = "String", example = "23")
    private String requestQuantity;


}
