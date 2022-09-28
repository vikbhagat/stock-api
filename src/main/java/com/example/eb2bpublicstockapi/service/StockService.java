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

    @Autowired DataSpoofingService spoofService;

    public List<ResponseDTO> getStock(RequestDTO requestDTO) throws JSONException {
        List<ResponseDTO> list = new ArrayList<>();
        for (int i = 0; i <requestDTO.getItemDto().size() ; i++) {
            ResponseDTO responseDTO = new ResponseDTO();
            responseDTO.setItemNumber(requestDTO.getItemDto().get(i).getItemNumber());
            responseDTO.setAvailableQuantity(quantityService.getQuantity(requestDTO.getItemDto().get(i).getItemNumber()));
            responseDTO.setPrice(pricingService.getPrice(requestDTO.getItemDto().get(i).getItemNumber()));
            responseDTO.setObsolete(toolService.getStatus());
            responseDTO.setRestockDate(spoofService.getSpoofDateResponse());
            list.add(responseDTO);
        }
        return list;
    }


}
