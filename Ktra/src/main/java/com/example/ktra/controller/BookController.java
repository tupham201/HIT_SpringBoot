package com.example.ktra.controller;

import com.example.ktra.base.RestApiV1;
import com.example.ktra.base.VsReponseUtil;
import com.example.ktra.constant.Url;
import com.example.ktra.dto.Request.CreateBookDTO;
import com.example.ktra.dto.Request.UpdateBookDTO;
import com.example.ktra.dto.entity.Book;
import com.example.ktra.service.BookService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestApiV1
@RestController
@RequestMapping("api/v1/book")
@RequiredArgsConstructor

public class BookController {
    private final BookService bookService;

    @GetMapping
    public ResponseEntity<?> getBooks() {
        return VsReponseUtil.success(bookService.getAllBooks());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getBook(@PathVariable String id) {
        return VsReponseUtil.success((bookService.getBookById(id)));
    }

    @PostMapping
    public ResponseEntity<?> createBook(@RequestBody CreateBookDTO createBookDTO) {
        return VsReponseUtil.success(bookService.createBook(createBookDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateBook(@RequestBody UpdateBookDTO updateBookDTO) {
        return VsReponseUtil.success(bookService.updateBook(updateBookDTO));
    }

    @DeleteMapping
    public ResponseEntity<?> deleteBook(@PathVariable String id) {
        bookService.deleteBook(id);
        return null;
    }

}
