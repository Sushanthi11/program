package com.Centum.BankApp.controller;

import com.Centum.BankApp.model.BankAccount;
import com.Centum.BankApp.repository.Bankrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class BankaccountController {
    @Autowired
    private Bankrepository bankrepository;
    @PostMapping("/savebankdetails")
    public ResponseEntity<String>savebankdetails(@RequestBody List<BankAccount> bankAccount){
        bankrepository.saveAll(bankAccount);
        return ResponseEntity.ok("bank account saved");
    }
}
