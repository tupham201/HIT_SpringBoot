package com.example.ktra.service;

import com.example.ktra.dto.Request.CreateBookDTO;
import com.example.ktra.dto.Request.UpdateBookDTO;
import com.example.ktra.dto.reponse.AuthorReponseDTO;
import com.example.ktra.dto.reponse.BookReponseDTO;

import java.util.List;

public interface BookService {
    List<BookReponseDTO> getAllBooks();
    BookReponseDTO createBook(CreateBookDTO createBookDTO);
    BookReponseDTO getBookById(String id);
    BookReponseDTO updateBook(UpdateBookDTO updateBookDTO);
    void deleteBook(String id);

}
