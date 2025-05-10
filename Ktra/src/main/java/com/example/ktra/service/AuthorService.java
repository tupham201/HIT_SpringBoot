package com.example.ktra.service;

import com.example.ktra.dto.Request.CreateAuthorDTO;
import com.example.ktra.dto.Request.UpdateAuthorDTO;
import com.example.ktra.dto.reponse.AuthorReponseDTO;

import java.util.List;

public interface AuthorService {
    List<AuthorReponseDTO> getAllAuthors();
    AuthorReponseDTO createAuthor(CreateAuthorDTO createAuthorDTO);
    AuthorReponseDTO findAuthorById(String id);
    AuthorReponseDTO updateAuthor(UpdateAuthorDTO updateAuthorDTO);
    void deleteAuthor(String id);
}
