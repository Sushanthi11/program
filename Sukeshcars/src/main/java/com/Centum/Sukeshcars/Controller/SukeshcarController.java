package com.Centum.Sukeshcars.Controller;

import com.Centum.Sukeshcars.dto.SukeshcarRequest;
import com.Centum.Sukeshcars.entity.Sukeshcar;
import com.Centum.Sukeshcars.Service.SukeshcarService;
import com.Centum.Sukeshcars.exception.UserNotfoundException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sukeshcars")
public class SukeshcarController {
    @Autowired
    private SukeshcarService service;

    @PostMapping("/signup")
    public ResponseEntity<Sukeshcar> saveUsers(@RequestBody @Valid SukeshcarRequest request){

        return new ResponseEntity<>(service.saveUsers(request), HttpStatus.CREATED);
    }
    @GetMapping("/fetchall")
    public ResponseEntity<List<Sukeshcar>>getallcars(){
        return ResponseEntity.ok(service.getCars());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Sukeshcar>getcarbyID(@PathVariable int id) throws UserNotfoundException {
        return ResponseEntity.ok(service.getcar(id));
    }
}