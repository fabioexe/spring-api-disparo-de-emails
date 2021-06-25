package com.fabioantunes.spring.business.Controller;

import com.fabioantunes.spring.business.Domain.User;
import com.fabioantunes.spring.business.Request.UserRequestBody;
import com.fabioantunes.spring.business.Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("user")
@AllArgsConstructor
public class UserController {

    @Autowired
    UserService userService;

    //Método POST
    @PostMapping
    private ResponseEntity<User> save(@RequestBody UserRequestBody userRequestBody){
        return new ResponseEntity<>(userService.saveUser(userRequestBody), HttpStatus.CREATED);
    }

}
