package com.example.eb2bpublicstockapi.DTO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.configurationprocessor.json.JSONObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@ApiModel
public class RequestDTO {
    @ApiModelProperty(name = "Location", dataType = "String", example = "Hilti NA HQ")
    private String location;
    @ApiModelProperty(name = "Street", dataType = "String", example = "123 Main ST.")
    private String street;
    @ApiModelProperty(name = "Postal", dataType = "String", example = "75055")
    private String postal;
    @ApiModelProperty(name = "Country", dataType = "String", example = "USA")
    private String country;
    @ApiModelProperty(name = "State", dataType = "String", example = "TX")
    private String state;
    private List<String> itemNumber;
    private List<String> quantity;

}
