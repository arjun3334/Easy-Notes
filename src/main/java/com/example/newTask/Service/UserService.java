package com.example.newTask.Service;

import com.example.newTask.dto.NoteDto;
import com.example.newTask.dto.UserDto;
import com.example.newTask.model.User;


public interface UserService {
   // User findByUserId(Long userId);

    User addUserUser(UserDto userDto);


    /*User addNewUser(NoteDto noteDto) {
    }*/
}
