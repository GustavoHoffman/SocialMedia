package com.example.RedeSocial.contoller;

import com.example.RedeSocial.Service.UserService;
import com.example.RedeSocial.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping
    @Transactional
    public User save (@RequestBody User user) {
       return userService.save(user);
    }


}
