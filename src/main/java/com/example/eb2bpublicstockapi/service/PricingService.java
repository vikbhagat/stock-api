package com.example.eb2bpublicstockapi.service;


import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;

import java.util.Random;

public class PricingService {

    Random rand = new Random();

    private JSONObject spoofPrices(String itemNumber) throws JSONException {
        JSONObject priceResponse = new JSONObject();
        JSONObject itemInfo = new JSONObject();
        JSONObject priceType = new JSONObject();
        Double listPrice = rand.nextDouble()*10;
        Double listPriceQuant = rand.nextInt(20)*5.0;

        priceResponse.put("material_number",itemNumber);
        itemInfo.put("status", 200);
        itemInfo.put("net_price", 0.03);
        itemInfo.put("unit_net_price", 3.0);
        itemInfo.put("sales_uom", "ST");
        itemInfo.put("quantity", 1.0);
        itemInfo.put("minimum_order_quantity", 25.0);
        itemInfo.put("list_price", listPrice.toString());
        itemInfo.put("list_price_quantity", listPriceQuant.toString());
        itemInfo.put("list_price_uom", "ST");
        itemInfo.put("uom_numerator", 1);
        itemInfo.put("uom_denominator", 1);
        priceType.put("standard", itemInfo);
        priceResponse.put("price", priceType);
        return priceResponse;
    }

    public String getPrice(String itemNumber) throws JSONException {
        JSONObject priceResponse;
        String price = "";

        priceResponse = spoofPrices(itemNumber);
        price = priceResponse.getJSONObject("standard").getString(price);

        return price;
    }
}
