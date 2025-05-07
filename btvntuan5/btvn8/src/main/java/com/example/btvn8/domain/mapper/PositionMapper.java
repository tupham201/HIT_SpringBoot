package com.example.btvn8.domain.mapper;

import com.example.btvn8.domain.dto.reponse.PositionReponseDTO;
import com.example.btvn8.domain.dto.request.position.CreatePositionDTO;
import com.example.btvn8.domain.entity.Position;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PositionMapper {
    Position toPosition(CreatePositionDTO createPositionDTO);
    PositionReponseDTO toPositionReponseDTO(Position position);
    List<PositionReponseDTO> toPositionReponseDTOList(List<Position> positions);
}
