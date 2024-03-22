package com.example.springMongoTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUsers")
    public ResponseEntity<List<User>> getAllUsers() {
        return new ResponseEntity<List<User>>(userService.allUsers(), HttpStatus.OK);
    }

    @PostMapping("/addUser")
    public ResponseEntity<Map<String, String>> setUser(@RequestBody User user) {
        userService.addUser(user);

        Map<String, String> response = new HashMap<>();
        response.put("message", "User is Successfully Added");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
