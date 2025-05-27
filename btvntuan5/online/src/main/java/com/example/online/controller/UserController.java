package com.example.online.controller;

import com.example.online.base.RestApiV1;
import com.example.online.base.VsReponseUtil;
import com.example.online.constant.UrlConstant;
import com.example.online.domain.dto.request.CreateUserDTO;
import com.example.online.domain.entity.User;
import com.example.online.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestApiV1
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping(UrlConstant.User.GET_USERS)
    public ResponseEntity<?> getAll(){
        return VsReponseUtil.success(userService.getAllUser());
    }

    @GetMapping(UrlConstant.User.GET_USER)
    public ResponseEntity<?> getById(@PathVariable String id){
        return VsReponseUtil.success(userService.getUserById(id));
    }

    @PostMapping(UrlConstant.User.CREATE_USER )
    public ResponseEntity<?> create(@Valid @RequestBody CreateUserDTO createUserDTO){
        return VsReponseUtil.success(userService.createUser(createUserDTO));
    }
}
