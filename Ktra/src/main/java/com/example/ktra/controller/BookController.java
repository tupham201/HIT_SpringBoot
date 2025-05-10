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

@RestApiV1
@RequestMapping("/book")
@RequiredArgsConstructor

public class BookController {
    @Autowired
    private final BookService bookService;

    @GetMapping(Url.Book.GET_BOOKS)
    public ResponseEntity<?> getBooks() {
        return VsReponseUtil.success(bookService.getAllBooks());
    }

    @GetMapping(Url.Book.GET_BOOK)
    public ResponseEntity<?> getBook(@PathVariable String id) {
        return VsReponseUtil.success((bookService.getBookById(id)));
    }

    @PostMapping(Url.Book.CREATE_BOOK)
    public ResponseEntity<?> createBook(@RequestBody CreateBookDTO createBookDTO) {
        return VsReponseUtil.success(bookService.createBook(createBookDTO));
    }

    @PostMapping(Url.Book.UPDATE_BOOK)
    public ResponseEntity<?> updateBook(@RequestBody UpdateBookDTO updateBookDTO) {
        return VsReponseUtil.success(bookService.updateBook(updateBookDTO));
    }

    @DeleteMapping(Url.Book.DELETE_BOOK)
    public ResponseEntity<?> deleteBook(@PathVariable String id) {
        bookService.deleteBook(id);
        return null;
    }

}
