package com.example.eb2bpublicstockapi.service;

import com.example.eb2bpublicstockapi.DTO.RequestDTO;
import com.example.eb2bpublicstockapi.DTO.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StockService {


    @Autowired QuantityService quantityService;

    public List<ResponseDTO> getStock(RequestDTO requestDTO) {
        List<ResponseDTO> list = new ArrayList<>();
        requestDTO.getItemNumber();
        for (String itemNumber: requestDTO.getItemNumber()) {
            ResponseDTO responseDTO = new ResponseDTO();
            responseDTO.setItemNumber(itemNumber);
            responseDTO.setAvailableQuantity(quantityService.getquantity(itemNumber));
            list.add(responseDTO);
        }

        return list;
    }
}
