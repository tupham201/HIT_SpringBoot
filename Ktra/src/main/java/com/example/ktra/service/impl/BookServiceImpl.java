package com.example.ktra.service.impl;

import com.example.ktra.constant.ErrorMessage;
import com.example.ktra.dto.Request.CreateBookDTO;
import com.example.ktra.dto.Request.UpdateBookDTO;
import com.example.ktra.dto.entity.Book;
import com.example.ktra.dto.mapper.BookMapper;
import com.example.ktra.dto.reponse.AuthorReponseDTO;
import com.example.ktra.dto.reponse.BookReponseDTO;
import com.example.ktra.exception.NotFoundException;
import com.example.ktra.repository.BookRepository;
import com.example.ktra.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    @Override
    public List<BookReponseDTO> getAllBooks() {
        return bookMapper.toBookReponseDTO(bookRepository.findAll());
    }

    @Override
    public BookReponseDTO createBook(CreateBookDTO createBookDTO) {
        Book book = bookMapper.tobook(createBookDTO);
        Book savedBook = bookRepository.save(book);
        return bookMapper.toBookReponseDTO(savedBook);
    }

    @Override
    public BookReponseDTO getBookById(String id) {
        Book book = bookRepository.findById(id).orElseThrow(() -> new NotFoundException(ErrorMessage.Book.BOOK_NOT_FOUND,new String[]{id}));
        return bookMapper.toBookReponseDTO(book);
    }

    @Override
    public BookReponseDTO updateBook(UpdateBookDTO updateBookDTO) {
        Book book = bookRepository.findById(updateBookDTO.getId()).orElseThrow(() -> new NotFoundException(ErrorMessage.Book.BOOK_NOT_FOUND,new String[]{updateBookDTO.getId()}));
        Book savedBook = bookRepository.save(book);
        return bookMapper.toBookReponseDTO(savedBook);
    }

    @Override
    public void deleteBook(String id) {
        if (!bookRepository.existsById(id)) {
            throw new NotFoundException(ErrorMessage.Book.BOOK_NOT_FOUND,new String[]{id});
        }
        bookRepository.deleteById(id);
    }
}
