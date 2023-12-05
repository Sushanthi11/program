package com.Centum.Sukeshcars.Service;

import com.Centum.Sukeshcars.dto.SukeshcarRequest;
import com.Centum.Sukeshcars.entity.Sukeshcar;
import com.Centum.Sukeshcars.exception.UserNotfoundException;
import com.Centum.Sukeshcars.repository.SukeshcarsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SukeshcarService {
    @Autowired
    private SukeshcarsRepo repo;

    public Sukeshcar saveUsers(SukeshcarRequest request) {
        Sukeshcar savinguser = new Sukeshcar();
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

    public List<Sukeshcar> getCars() {
        return repo.findAll();
    }

    public Sukeshcar getcar(int id) throws UserNotfoundException {
        Sukeshcar car = repo.findById(id);
        if (car != null) {
            return (car);
        } else {
            throw new UserNotfoundException("the car you are seaching is not avaiable");
        }
    }
}

