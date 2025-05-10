package com.example.ktra.controller;

import com.example.ktra.base.RestApiV1;
import com.example.ktra.base.VsReponseUtil;
import com.example.ktra.constant.Url;
import com.example.ktra.dto.Request.CreateAuthorDTO;
import com.example.ktra.dto.Request.UpdateAuthorDTO;
import com.example.ktra.dto.reponse.AuthorReponseDTO;
import com.example.ktra.repository.AuthorRepository;
import com.example.ktra.service.AuthorService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestApiV1
@RequestMapping("/author")
@RequiredArgsConstructor
public class AuthorController {
    @Autowired
    private final AuthorService authorService;

    @GetMapping(Url.Author.GET_AUTHORS)
    public ResponseEntity<?> getAllAuthor() {
        return VsReponseUtil.success(authorService.getAllAuthors());
    }

    @PostMapping(Url.Author.CREATE_AUTHOR)
    public ResponseEntity<?> createAuthor(CreateAuthorDTO createAuthorDTO) {
        return VsReponseUtil.success(authorService.createAuthor(createAuthorDTO));
    }

    @PostMapping(Url.Author.UPDATE_AUTHOR)
    public ResponseEntity<?> updateAuthor(UpdateAuthorDTO updateAuthorDTO) {
        return VsReponseUtil.success(authorService.updateAuthor(updateAuthorDTO));
    }

    @GetMapping(Url.Author.GET_AUTHOR)
    public ResponseEntity<?> getAuthor(@PathVariable String id) {
        return VsReponseUtil.success(authorService.findAuthorById(id));
    }

    @DeleteMapping(Url.Author.DELETE_AUTHOR)
    public ResponseEntity<?> deleteAuthor(@PathVariable String id) {
        authorService.deleteAuthor(id);
        return null;
    }

}
