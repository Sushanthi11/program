package com.Centum.VaultLocker.controller;

import com.Centum.VaultLocker.dto.LoginDto;
import com.Centum.VaultLocker.dto.UserDto;
import com.Centum.VaultLocker.entity.User;
import com.Centum.VaultLocker.response.LoginResponse;
import com.Centum.VaultLocker.service.LockerService;
import com.Centum.VaultLocker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/user")
public class UserController {
    private LockerService lockerService;
    @Autowired
    private UserService userService;

    @PostMapping(path = "/save")
    public String saveUser(@RequestBody UserDto userDto){
        String id =userService.addUser(userDto);
        return id;
    }
    @PostMapping(path = "/login")
    public ResponseEntity<?>LoginUser(@RequestBody LoginDto loginDto){
        LoginResponse loginResponse=userService.loginUser(loginDto);
        return ResponseEntity.ok(loginResponse);
    }


   // @PostMapping(path = "/openLocker/{userId}")
    //    public ResponseEntity<String> openLocker(@PathVariable int userId) {
    //        String result = userService.openLocker(userId);
    //        return ResponseEntity.ok(result);
    //    }
    //
    //    @PostMapping(path = "/closeLocker/{userId}")
    //    public ResponseEntity<String> closeLocker(@PathVariable int userId) {
    //        String result = userService.closeLocker(userId);
    //        return ResponseEntity.ok(result);
    //    }


       @GetMapping("/")
       public List<User> getAllUsers() {
           return userService.getAllUsers();
       }

       @GetMapping("/{id}")
       public ResponseEntity<User> getUserById(@PathVariable Integer id) {
           User user = userService.getUserById(id);
           if (user != null) {
               return ResponseEntity.ok(user);
           } else {
               return ResponseEntity.notFound().build();
           }
       }

       @PostMapping("/")
       public ResponseEntity<User> createUser(@RequestBody User user) {
           User createdUser = userService.createUser(user);
           return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
       }

       @PutMapping("/{id}")
       public ResponseEntity<User> updateUser(@PathVariable Integer id, @RequestBody User updatedUser) {
           User user = userService.updateUser(id, updatedUser);
           if (user != null) {
               return ResponseEntity.ok(user);
           } else {
               return ResponseEntity.notFound().build();
           }
       }

       @DeleteMapping("/{id}")
       public ResponseEntity<Void> deleteUser(@PathVariable Integer id) {
           userService.deleteUser(id);
           return ResponseEntity.noContent().build();
       }

       @PostMapping("/{userId}/grant-access/{lockerId}")
       public ResponseEntity<Void> grantAccessToLocker(@PathVariable Integer userId, @PathVariable Long lockerId) {
           userService.grantAccessToLocker(userId, lockerId);
           return ResponseEntity.ok().build();
       }
}
