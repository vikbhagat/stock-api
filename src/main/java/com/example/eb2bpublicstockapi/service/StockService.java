package com.example.eb2bpublicstockapi.service;

import com.example.eb2bpublicstockapi.DTO.RequestDTO;
import com.example.eb2bpublicstockapi.DTO.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StockService {


    @Autowired QuantityService quantityService;

    @Autowired PricingService pricingService;

    @Autowired ToolService toolService;

    public List<ResponseDTO> getStock(RequestDTO requestDTO) throws JSONException {
        List<ResponseDTO> list = new ArrayList<>();
        requestDTO.getItemNumber();
        for (String itemNumber: requestDTO.getItemNumber()) {
            ResponseDTO responseDTO = new ResponseDTO();
            responseDTO.setItemNumber(itemNumber);
            responseDTO.setAvailableQuantity(quantityService.getQuantity(itemNumber));
            responseDTO.setPrice(pricingService.getPrice(itemNumber));
            responseDTO.setObsolete(toolService.getStatus());
            list.add(responseDTO);
        }

        return list;
    }
}
