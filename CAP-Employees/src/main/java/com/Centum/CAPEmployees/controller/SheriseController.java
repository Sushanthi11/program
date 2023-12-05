package com.Centum.CAPEmployees.controller;

import com.Centum.CAPEmployees.model.Sherise;
import com.Centum.CAPEmployees.service.SheriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Centum")
public class SheriseController {
    @Autowired
    private SheriseService service;
    @PostMapping("/newemployee")
    public List<Sherise> saveEmployees(@RequestBody List<Sherise>employees){
        return service.saveEmployees(employees);
    }
    @GetMapping("/emp/{id}")
    public Sherise getEmployeeById(@PathVariable int id){
        return service.getEmployeeById(id);
    }
    @GetMapping("/emps")
    public List<Sherise>getEmployees(){
        return service.getEmployees();
    }
    @DeleteMapping("/emp/{id}")
    public String deleteEmployeeByID(@PathVariable int id){
        return service.deleteEmployeeById(id);
    }
}
