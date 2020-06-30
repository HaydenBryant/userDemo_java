package com.webencyclop.demo.service;

import com.webencyclop.demo.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public void saveUser(User user);
    public boolean isUserAlreadyPresent(User user);

}
