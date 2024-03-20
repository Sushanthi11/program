package com.Centum.VaultLocker.controller;

import com.Centum.VaultLocker.entity.Locker;
import com.Centum.VaultLocker.service.LockerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/locker")
public class LockerController {
    @Autowired
    private LockerService lockerService;

    @GetMapping("/")
    public List<Locker> getAllLockers() {
        return lockerService.getAllLockers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Locker> getLockerById(@PathVariable Long id) {
        Locker locker = lockerService.getLockerById(id);
        if (locker != null) {
            return ResponseEntity.ok(locker);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/")
    public ResponseEntity<Locker> createLocker(@RequestBody Locker locker) {
        Locker createdLocker = lockerService.createLocker(locker);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdLocker);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Locker> updateLocker(@PathVariable Long id, @RequestBody Locker updatedLocker) {
        Locker locker = lockerService.updateLocker(id, updatedLocker);
        if (locker != null) {
            return ResponseEntity.ok(locker);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLocker(@PathVariable Long id) {
        lockerService.deleteLocker(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/{lockerId}/grant-access/{userId}")
    public ResponseEntity<Void> grantAccessToUser(@PathVariable Long lockerId, @PathVariable Integer userId) {
        lockerService.grantAccessToUser(lockerId, userId);
        return ResponseEntity.ok().build();
    }
}