package com.example.tuan9.controller;

import com.example.tuan9.domain.dto.request.CreateUserDTO;
import com.example.tuan9.domain.dto.request.LoginRequestDTO;
import com.example.tuan9.domain.dto.response.ApiResponseDTO;
import com.example.tuan9.domain.dto.response.UserResponseDTO;
import com.example.tuan9.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/user")
public class UserController {
    private final UserService userService;

    @GetMapping("/users")
    public ResponseEntity<ApiResponseDTO<List<UserResponseDTO>>> getAllUsers() {
        List<UserResponseDTO> users = userService.getAllUsers();
        return ResponseEntity.ok(new ApiResponseDTO<>(true, "Danh sách ", users));
    }
    @PostMapping("/register")
    public ResponseEntity<ApiResponseDTO<UserResponseDTO>> register(@RequestBody CreateUserDTO request) {
        UserResponseDTO createdUser = userService.register(request);
        return ResponseEntity.ok(new ApiResponseDTO<>(true,"Khởi tạo thành công rồi nè", createdUser));
    }

    @PostMapping("/login")
    public ResponseEntity<ApiResponseDTO<?>> login(@RequestBody LoginRequestDTO request) {
        UserResponseDTO loginResult = userService.login(request);
        return ResponseEntity.ok(new ApiResponseDTO<>(true,"Đăng nhập thành công", loginResult));
    }
}
