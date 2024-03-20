package com.Centum.VaultLocker.service;

import com.Centum.VaultLocker.dto.LoginDto;
import com.Centum.VaultLocker.dto.UserDto;
import com.Centum.VaultLocker.entity.Locker;
import com.Centum.VaultLocker.entity.User;
import com.Centum.VaultLocker.repository.LockerRepository;
import com.Centum.VaultLocker.repository.UserRepository;
import com.Centum.VaultLocker.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private LockerRepository lockerRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(Integer id, User updatedUser) {
        User existingUser = userRepository.findById(id).orElse(null);
        if (existingUser != null) {
            existingUser.setUsername(updatedUser.getUsername());
            // Update other fields as needed
            return userRepository.save(existingUser);
        }
        return null;
    }

    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }

    public void grantAccessToLocker(Integer userId, Long lockerId) {
        User user = userRepository.findById(userId).orElse(null);
        Locker locker = lockerRepository.findById(lockerId).orElse(null);

        if (user != null && locker != null) {
            user.getLockers().add(locker);
            userRepository.save(user);
        }
    }

    public String addUser(UserDto userDto) {
        return  null;
    }

    public LoginResponse loginUser(LoginDto loginDto) {
        return null;
    }
}
