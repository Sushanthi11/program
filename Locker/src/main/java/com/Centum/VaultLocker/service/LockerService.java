package com.Centum.VaultLocker.service;

import com.Centum.VaultLocker.entity.Locker;
import com.Centum.VaultLocker.entity.User;
import com.Centum.VaultLocker.repository.LockerRepository;
import com.Centum.VaultLocker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LockerService {
    @Autowired
    private LockerRepository lockerRepository;
    @Autowired
    private UserRepository userRepository;
    public List<Locker> getAllLockers() {
        return lockerRepository.findAll();
    }

    public Locker getLockerById(Long id) {
        return lockerRepository.findById(id).orElse(null);
    }

    public Locker createLocker(Locker locker) {
        return lockerRepository.save(locker);
    }

    public Locker updateLocker(Long id, Locker updatedLocker) {
        Locker existingLocker = lockerRepository.findById(id).orElse(null);
        if (existingLocker != null) {
            existingLocker.setLockernumber(updatedLocker.getLockernumber());
            existingLocker.setIsavailable(updatedLocker.isIsavailable());
            // Update other fields as needed
            return lockerRepository.save(existingLocker);
        }
        return null;
    }

    public void deleteLocker(Long id) {
        lockerRepository.deleteById(id);
    }

    public void grantAccessToUser(Long lockerId, Integer userId) {
        Locker locker = lockerRepository.findById(lockerId).orElse(null);
        User user = userRepository.findById(userId).orElse(null);

        if (locker != null && user != null) {
            locker.getUsers().add(user);
            lockerRepository.save(locker);
        }
    }

    public Locker saveLocker(Locker locker) {
        return null;
    }

    public void openLocker() {
    }
}