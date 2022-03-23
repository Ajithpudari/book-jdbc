package com.example.bookdemo.repository;


import com.example.bookdemo.Book;

import java.io.InputStream;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface BookRepository {

    int count();

    int save(Book book);

    int update(Book book);

    int deleteById(Long id);

    List<Book> findAll();


    List<Book> findByNameAndPrice(String name, BigDecimal price);


    Optional<Book> findById(Long id);

    String getNameById(Long id);

    Object findNameById(long l);


}