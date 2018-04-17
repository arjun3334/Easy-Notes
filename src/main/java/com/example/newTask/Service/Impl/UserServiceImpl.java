package com.example.newTask.Service.Impl;

import com.example.newTask.Service.UserService;
import com.example.newTask.dto.NoteDto;
import com.example.newTask.dto.UserDto;
import com.example.newTask.exception.ResourceNotFoundException;
import com.example.newTask.model.Status;
import com.example.newTask.model.User;
import com.example.newTask.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;


    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

/*
    @Override
    public User findByUserId(Long userId) {
        return userRepository.findById(userId).
                orElseThrow(()-> new ResourceNotFoundException("User","Id", userId));

    }
*/

    @Override
    public User addUserUser(UserDto userDto) {
        User user= new User();
        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());
        user.setStatus(Status.ACTIVE);
        return userRepository.save(user);
    }

   /* @Override
    public User addNewUser(NoteDto noteDto) {
        //return;
    }*/
}
