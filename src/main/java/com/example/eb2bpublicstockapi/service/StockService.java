package com.example.eb2bpublicstockapi.service;

import com.example.eb2bpublicstockapi.DTO.RequestDTO;
import com.example.eb2bpublicstockapi.DTO.ResponseDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StockService {


    public List<ResponseDTO> getStock(RequestDTO requestDTO) {
        ResponseDTO responseDTO = new ResponseDTO();
        List<ResponseDTO> list = new ArrayList<>();
        list.add(responseDTO);
        return list;
    }
}
