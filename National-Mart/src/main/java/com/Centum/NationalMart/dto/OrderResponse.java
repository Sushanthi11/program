package com.Centum.NationalMart.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class OrderResponse {
    private String customername;
    private  String productname;
    private  String productprice;

    public OrderResponse(String customername, String productname, String productprice) {
        this.customername = customername;
        this.productname = productname;
        this.productprice = productprice;
    }
}