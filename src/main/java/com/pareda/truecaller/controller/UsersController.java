package com.pareda.truecaller.controller;

import com.pareda.truecaller.model.response.UserResponse;
import com.pareda.truecaller.util.GlobalConstant;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.pareda.truecaller.util.GlobalConstant.BASE_API_PATH_V1;

/**
 *
 *  *
 *  * 1. /users -> Name, email, phone
 *  * 2. /identity -> phone | user
 *  * 3. /block -> user1 , user2 | boolean
 */



@RestController
@RequestMapping("/api/v1")
public class UsersController {

    @GetMapping("/users/{id}")
    public UserResponse getUsers(@PathVariable String id) {
        //get user
    }

    public

}
