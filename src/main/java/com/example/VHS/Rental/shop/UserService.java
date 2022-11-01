package com.example.VHS.Rental.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void addUser(User user) {
        userRepository.save(user);
    }

    public Optional<User> getUser(Long id){
        return userRepository.findById(id);
    }

    public void updateUser (User user){
        userRepository.save(user);
    }

    public void deleteUserById (Long id){
        userRepository.deleteById(id);
    }

}
