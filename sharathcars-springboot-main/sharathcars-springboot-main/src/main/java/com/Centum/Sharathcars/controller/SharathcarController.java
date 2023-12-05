package com.Centum.Sharathcars.controller;

import com.Centum.Sharathcars.dto.SharathcarRequest;
import com.Centum.Sharathcars.entity.Sharathcar;
import com.Centum.Sharathcars.service.SharathcarService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sharathcars")
public class SharathcarController {
    @Autowired
    private SharathcarService service;

    @PostMapping("/signup")
    public ResponseEntity<Sharathcar> saveUsers(@RequestBody @Valid SharathcarRequest request){

        return new ResponseEntity<>(service.saveUsers(request), HttpStatus.CREATED);
    }
}
