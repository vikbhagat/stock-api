package com.example.eb2bpublicstockapi.DTO;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.configurationprocessor.json.JSONObject;

@Getter
@Setter
public class RequestDTO {
    private LocationDTO location;
    private ItemDTO[] itemInformation;
}
