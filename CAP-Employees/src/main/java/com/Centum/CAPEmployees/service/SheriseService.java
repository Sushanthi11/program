package com.Centum.CAPEmployees.service;

import com.Centum.CAPEmployees.model.Sherise;
import com.Centum.CAPEmployees.repository.Sheriserepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SheriseService {
    @Autowired
    private Sheriserepo repo;
    public List<Sherise> saveEmployees(List<Sherise> employees) {

        return repo.saveAll(employees);
    }
    public Sherise getEmployeeById(int id){
        return repo.findById(id).orElse(null);
    }
    public List<Sherise> getEmployees(){
        return repo.findAll();
    }
    public String deleteEmployeeById(int id){
        repo.deleteById(id);
        return "employee details deleted";
    }
}
