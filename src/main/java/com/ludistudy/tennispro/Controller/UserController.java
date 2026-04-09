package com.ludistudy.tennispro.Controller;

import com.ludistudy.tennispro.Dto.GetUserResponseDto;
import com.ludistudy.tennispro.Entity.User;
import com.ludistudy.tennispro.Service.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("user/{id}")
    public GetUserResponseDto getUserById(@PathVariable UUID id) {
        User user = userService.getUserById(id);
        return new GetUserResponseDto(
                user.getId(),
                user.getName(),
                user.getAge(),
                user.getUtrScore(),
                user.getExperience()
        );
    }
}