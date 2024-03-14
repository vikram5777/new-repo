package com.spring.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.Entity.Book;
import com.spring.Repo.Repo;
@Repository
public class SpringDaoImple implements SpringDao {
@Autowired
  private Repo rep;
	@Override
	public Book getBookById(int id) {
	  Optional<Book> byId = rep.findById(id);
		Book book = byId.get();
		return book;
	}

	@Override
	public List<Book> getAllBook() {
		List<Book> all = (List<Book>) rep.findAll();
		
		return all;
	}
    public Book SaveBook(Book b) {
    	 Book book = rep.save(b);
		return b;
    	
    }
}
