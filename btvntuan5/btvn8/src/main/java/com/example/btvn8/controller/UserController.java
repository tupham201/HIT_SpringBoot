package com.example.btvn8.controller;

import com.example.btvn8.base.RestApiV1;
import com.example.btvn8.base.VsReponseUtil;
import com.example.btvn8.constant.UrlConstant;
import com.example.btvn8.domain.dto.request.user.CreateUserDTO;
import com.example.btvn8.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestApiV1
@RequestMapping("/user")
@RequiredArgsConstructor

public class UserController {
    private final UserService userService;

    @GetMapping(UrlConstant.User.GET_USERS)
    public ResponseEntity<?> getAll(){
        return VsReponseUtil.success(userService.getAllUsers());
    }

    @PostMapping(UrlConstant.User.CREATE_USER)
    public ResponseEntity<?> createUser(@Valid @RequestBody CreateUserDTO createUserDTO){
        return VsReponseUtil.success(userService.createUser(createUserDTO));
    }

    @PostMapping(UrlConstant.User.UPDATE_USER)
    public ResponseEntity<?> updateUser(@PathVariable String id){
        return VsReponseUtil.success(userService.updateUser(id));
    }

    @DeleteMapping(UrlConstant.User.DELETE_USER)
    public ResponseEntity<?> deleteUser(@PathVariable String id){
        userService.deleteUser(id);
        return VsReponseUtil.success("Deleted successfully");
    }
}
