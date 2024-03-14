package com.spring.Dao;

import java.util.List;

import com.spring.Entity.Book;

public interface SpringDao {
public Book getBookById(int id);
public List<Book> getAllBook();
public Book SaveBook(Book b);
}
