package com.example.ktra.controller;

import com.example.ktra.base.RestApiV1;
import com.example.ktra.base.VsReponseUtil;
import com.example.ktra.dto.Request.CreateAuthorDTO;
import com.example.ktra.dto.Request.UpdateAuthorDTO;
import com.example.ktra.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestApiV1
//@RestController
@RequestMapping("/authors")
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorService authorService;

    @GetMapping
    public ResponseEntity<?> getAllAuthor() {
        return VsReponseUtil.success(authorService.getAllAuthors());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getAuthor(@PathVariable String id) {
        return VsReponseUtil.success(authorService.findAuthorById(id));
    }

    @PostMapping
    public ResponseEntity<?> createAuthor(@RequestBody CreateAuthorDTO createAuthorDTO) {
        return VsReponseUtil.success(authorService.createAuthor(createAuthorDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateAuthor(@PathVariable String id, @RequestBody UpdateAuthorDTO updateAuthorDTO) {
        updateAuthorDTO.setId(id);
        return VsReponseUtil.success(authorService.updateAuthor(updateAuthorDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteAuthor(@PathVariable String id) {
        authorService.deleteAuthor(id);
        return VsReponseUtil.success("Deleted");
    }
}
