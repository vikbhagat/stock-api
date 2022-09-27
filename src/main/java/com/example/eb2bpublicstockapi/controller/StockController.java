package com.example.eb2bpublicstockapi.controller;

import com.example.eb2bpublicstockapi.DTO.RequestDTO;
import com.example.eb2bpublicstockapi.DTO.ResponseDTO;
import com.example.eb2bpublicstockapi.service.StockService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/stock")
@RestController
public class StockController {



    private static final Logger LOG = LoggerFactory.getLogger(StockController.class);

    @Autowired StockService stockService;


    @PostMapping()
    @ResponseStatus(HttpStatus.OK)
    public  @ResponseBody List<ResponseDTO> requestCatalog(RequestDTO requestDTO) {

        return  stockService.getStock(requestDTO);
    }





}