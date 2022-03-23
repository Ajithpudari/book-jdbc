package com.example.bookdemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class Book {

    private Long id;
    private String name;
    private BigDecimal price;


    public Book(String thinking_in_java, BigDecimal bigDecimal) {

    }
}