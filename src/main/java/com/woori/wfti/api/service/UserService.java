package com.woori.wfti.api.service;

import com.woori.wfti.db.entity.UserEntity;
import com.woori.wfti.db.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserEntity> getUsers() {
        List<UserEntity> users = userRepository.findAll();

        if(!users.isEmpty()) return userRepository.findAll();
        else throw new IllegalArgumentException("no such data");
    }

    public UserEntity createUser(final UserEntity createUser) {
        if(createUser == null) throw new IllegalArgumentException("UserEntity cannot be null");
        return userRepository.save(createUser);
    }
}
