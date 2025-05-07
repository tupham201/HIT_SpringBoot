package com.example.btvn8.service;

import com.example.btvn8.domain.dto.reponse.PositionReponseDTO;
import com.example.btvn8.domain.dto.request.position.CreatePositionDTO;

import java.util.List;

public interface PositionService {
    List<PositionReponseDTO> getAllPositions();
    PositionReponseDTO createPosition(CreatePositionDTO createPositionDTO);
    PositionReponseDTO updatePosition(String id);
    void deletePosition(String id);
}
