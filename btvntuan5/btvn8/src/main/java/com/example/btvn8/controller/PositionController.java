package com.example.btvn8.controller;

import com.example.btvn8.base.RestApiV1;
import com.example.btvn8.base.VsReponseUtil;
import com.example.btvn8.constant.UrlConstant;
import com.example.btvn8.domain.dto.request.position.CreatePositionDTO;
import com.example.btvn8.domain.dto.request.user.CreateUserDTO;
import com.example.btvn8.service.PositionService;
import com.example.btvn8.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestApiV1
@RequestMapping("/position")
@RequiredArgsConstructor

public class PositionController {
    private final PositionService positionService;

    @GetMapping(UrlConstant.Position.GET_POSITIONS)
    public ResponseEntity<?> getAll(){
        return VsReponseUtil.success(positionService.getAllPositions());
    }

    @PostMapping(UrlConstant.Position.CREATE_POSITION)
    public ResponseEntity<?> createPosition(@Valid @RequestBody CreatePositionDTO createPositionDTO){
        return VsReponseUtil.success(positionService.createPosition(createPositionDTO));
    }

    @PostMapping(UrlConstant.Position.UPDATE_POSITION)
    public ResponseEntity<?> updatePosition(@PathVariable String id){
        return VsReponseUtil.success(positionService.updatePosition(id));
    }

    @DeleteMapping(UrlConstant.Position.DELETE_POSITION)
    public ResponseEntity<?> deletePosition(@PathVariable String id){
        positionService.deletePosition(id);
        return VsReponseUtil.success("Deleted successfully");
    }
}
