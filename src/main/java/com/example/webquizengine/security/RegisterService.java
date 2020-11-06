package com.example.webquizengine.security;

import com.example.webquizengine.domain.User;
import com.example.webquizengine.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class RegisterService {

    @Autowired
    UserRepository userRepo;

    @Autowired
    PasswordEncoder encoder;

    public void register(User user) {
        String encodedPassword = encoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        userRepo.save(user);
    }


}
