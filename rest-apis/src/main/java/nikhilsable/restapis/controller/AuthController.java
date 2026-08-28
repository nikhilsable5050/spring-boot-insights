package nikhilsable.restapis.controller;

import lombok.RequiredArgsConstructor;
import nikhilsable.restapis.entity.User;
import nikhilsable.restapis.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }
}