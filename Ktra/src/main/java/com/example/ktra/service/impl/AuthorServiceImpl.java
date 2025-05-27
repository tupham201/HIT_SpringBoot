package com.example.ktra.service.impl;

import com.example.ktra.constant.ErrorMessage;
import com.example.ktra.dto.Request.CreateAuthorDTO;
import com.example.ktra.dto.Request.UpdateAuthorDTO;
import com.example.ktra.dto.entity.Author;
import com.example.ktra.dto.mapper.AuthorMapper;
import com.example.ktra.dto.reponse.AuthorReponseDTO;
import com.example.ktra.exception.NotFoundException;
import com.example.ktra.repository.AuthorRepository;
import com.example.ktra.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;
    private final AuthorMapper authorMapper;


    @Override
    public List<AuthorReponseDTO> getAllAuthors() {
        return authorMapper.toAuthorReponseDTO(authorRepository.findAll());
    }

    @Override
    public AuthorReponseDTO createAuthor(CreateAuthorDTO createAuthorDTO) {
        Author author = authorMapper.toAuthor(createAuthorDTO);
        Author savedAuthor = authorRepository.save(author);
        return authorMapper.toAuthorReponseDTO(savedAuthor);
    }

    @Override
    public AuthorReponseDTO findAuthorById(String id) {
        Author author = authorRepository.findById(id).orElseThrow(() -> new NotFoundException(ErrorMessage.Author.AUTHOR_NOT_FOUND,new String[]{id}));
        return authorMapper.toAuthorReponseDTO(author);
    }

    @Override
    public AuthorReponseDTO updateAuthor(UpdateAuthorDTO updateAuthorDTO) {
        Author author = authorRepository.findById(updateAuthorDTO.getId()).orElseThrow(() -> new NotFoundException(ErrorMessage.Author.AUTHOR_NOT_FOUND,new String[]{updateAuthorDTO.getId()}));
        Author savedAuthor = authorRepository.save(author);
        return authorMapper.toAuthorReponseDTO(savedAuthor);
    }

    @Override
    public void deleteAuthor(String id) {
        if (!authorRepository.existsById(id)) {
            throw new NotFoundException(ErrorMessage.Author.AUTHOR_NOT_FOUND,new String[]{id});
        }
        authorRepository.deleteById(id);
    }


}
