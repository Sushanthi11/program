package com.Centum.NationalMart.controller;

import com.Centum.NationalMart.dto.OrderRequest;
import com.Centum.NationalMart.dto.OrderResponse;
import com.Centum.NationalMart.repository.Customerrepository;
import com.Centum.NationalMart.repository.Productrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.Centum.NationalMart.entity.Customer;

import java.util.List;
@RestController
@RequestMapping("/Nationalmart")
public class OrderController {
    @Autowired
    private Customerrepository customerrepository;
    @Autowired
    private Productrepository productrepository;
    @PostMapping("/orderyourproducts")
    public Customer placeOrder(@RequestBody OrderRequest request){
        return customerrepository.save(request.getCustomer());
    }
    @GetMapping("findallorders")
    public List<Customer> findAllOrders(){
        return customerrepository.findAll();
    }
    @GetMapping("/getinfo")
    public List<OrderResponse>getjoinInformation(){
        return customerrepository.getJoinInformation();
    }

}