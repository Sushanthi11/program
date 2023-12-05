package com.Centum.Sharathcars.service;

import com.Centum.Sharathcars.dto.SharathcarRequest;
import com.Centum.Sharathcars.entity.Sharathcar;
import com.Centum.Sharathcars.repository.SharathcarsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SharathcarService {
    @Autowired
    private SharathcarsRepo repo;

    public Sharathcar saveUsers(SharathcarRequest request){
        Sharathcar savinguser=new Sharathcar();
        savinguser.setId(0);
        savinguser.setCarcode(request.getCarcode());
        savinguser.setCarname(request.getCarname());
        savinguser.setCarmodel(request.getCarmodel());
        savinguser.setCaryear(request.getCaryear());
        savinguser.setCarcolour(request.getCarcolour());
        savinguser.setCarvin(request.getCarvin());
        savinguser.setCarowner(request.getCarowner());
        savinguser.setState(request.getState());
        savinguser.setMobilenumber(request.getMobilenumber());
        savinguser.setPrice(request.getPrice());
        savinguser.setDetails(request.getDetails());
        return repo.save(savinguser);
    }
}
