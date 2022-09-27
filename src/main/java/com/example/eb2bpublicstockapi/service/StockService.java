package com.example.eb2bpublicstockapi.service;

import com.example.eb2bpublicstockapi.DTO.RequestDTO;
import com.example.eb2bpublicstockapi.DTO.ResponseDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StockService {


    public List<ResponseDTO> getStock(RequestDTO requestDTO) {
        List<ResponseDTO> list = new ArrayList<>();
        requestDTO.getItemNumber();
        for (int itemNumber: requestDTO.getItemNumber()) {
            ResponseDTO responseDTO = new ResponseDTO();
            responseDTO.setItemNumber(String.valueOf(itemNumber));
            list.add(responseDTO);
        }

        return list;
    }
}
