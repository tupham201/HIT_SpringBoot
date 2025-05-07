package com.example.btvn8.service.impl;

import com.example.btvn8.constant.ErrorMessage;
import com.example.btvn8.domain.dto.reponse.PositionReponseDTO;
import com.example.btvn8.domain.dto.request.position.CreatePositionDTO;
import com.example.btvn8.domain.entity.Position;
import com.example.btvn8.domain.mapper.PositionMapper;
import com.example.btvn8.exception.NotFoundException;
import com.example.btvn8.repository.PositionRepository;
import com.example.btvn8.service.PositionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PositionServiceImpl implements PositionService {

    private final PositionRepository positionRepository;
    private final PositionMapper positionMapper;

    @Override
    public List<PositionReponseDTO> getAllPositions() {
        return positionMapper.toPositionReponseDTOList(positionRepository.findAll());
    }

    @Override
    public PositionReponseDTO createPosition(CreatePositionDTO createPositionDTO) {
        Position position = positionMapper.toPosition(createPositionDTO);
        Position savedPosition = positionRepository.save(position);
        return positionMapper.toPositionReponseDTO(savedPosition);
    }

    @Override
    public PositionReponseDTO updatePosition(String id) {
        Position position = positionRepository.findById(id).orElseThrow(() -> new NotFoundException(ErrorMessage.Position.ERR_NOT_FOUND_POSITION,new String[]{id}));
        Position savedPosition = positionRepository.save(position);
        return positionMapper.toPositionReponseDTO(savedPosition);
    }

    @Override
    public void deletePosition(String id) {
        if(positionRepository.existsById(id)){
            throw new NotFoundException(ErrorMessage.Position.ERR_NOT_FOUND_POSITION,new String[]{id});
        }
        positionRepository.deleteById(id);
    }
}
