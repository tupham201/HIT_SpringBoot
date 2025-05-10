package com.example.ktra.dto.mapper;

import com.example.ktra.dto.Request.CreateBookDTO;
import com.example.ktra.dto.Request.UpdateBookDTO;
import com.example.ktra.dto.entity.Book;
import com.example.ktra.dto.reponse.BookReponseDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BookMapper {
    Book tobook(CreateBookDTO createBookDTO);
    Book updatebook(UpdateBookDTO updateBookDTO);
    BookReponseDTO toBookReponseDTO(Book book);
    List<BookReponseDTO> toBookReponseDTO(List<Book> books);
}
