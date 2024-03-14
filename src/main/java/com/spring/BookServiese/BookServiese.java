package com.spring.BookServiese;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.Dao.SpringDaoImple;
import com.spring.Entity.Book;

@Service
public class BookServiese {
	@Autowired
	private SpringDaoImple imp;
	
	public Book getbyId(int id) {
		Book d = imp.getBookById(id);
		return d;
	}
	public List<Book> getAllBook(){
		 List<Book> list = imp.getAllBook();
		return list;
		
	}
	public Book Savebook(Book b) {
		Book saveBook = imp.SaveBook(b);
		return saveBook;
	}
}
