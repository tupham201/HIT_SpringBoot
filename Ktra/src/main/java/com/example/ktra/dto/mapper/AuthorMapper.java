package com.example.ktra.dto.mapper;

import com.example.ktra.dto.Request.CreateAuthorDTO;
import com.example.ktra.dto.Request.CreateBookDTO;
import com.example.ktra.dto.Request.UpdateAuthorDTO;
import com.example.ktra.dto.entity.Author;
import com.example.ktra.dto.reponse.AuthorReponseDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AuthorMapper {
    Author toAuthor(CreateAuthorDTO createAuthorDTO);
    Author updateAuthor(UpdateAuthorDTO updateAuthorDTO);
    AuthorReponseDTO toAuthorReponseDTO(Author author);
    List<AuthorReponseDTO> toAuthorReponseDTO(List<Author> authors);
}
