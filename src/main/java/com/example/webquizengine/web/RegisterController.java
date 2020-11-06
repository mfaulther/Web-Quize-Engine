package com.example.webquizengine.web;

import com.example.webquizengine.domain.User;
import com.example.webquizengine.repository.UserRepository;
import com.example.webquizengine.security.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    RegisterService registerService;

    @PostMapping
    public String register(@RequestBody User user) {
        registerService.register(user);
        return "User successfully saved :)";
    }


}
