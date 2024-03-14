package com.spring.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.spring.BookServiese.BookServiese;
import com.spring.Entity.Author;
import com.spring.Entity.Book;

@RestController

public class AppController {
	@Autowired
private BookServiese bs;
	@GetMapping("/book/{id}")
public ResponseEntity<Book> getBook(@PathVariable("id") int id){
	Book book;
	 book = this.bs.getbyId(id);
	//Object bool;
	if(book==null) {
	 
	return (ResponseEntity<Book>) ResponseEntity.status(HttpStatus.NOT_FOUND);
	}  else {
		return ResponseEntity.of(Optional.of(book));
	     }
       }
 @GetMapping("/book")	
  public ResponseEntity<List<Book>> getAllbook(){
	  List<Book> list = bs.getAllBook();
	    
	return  new ResponseEntity<>(list, HttpStatus.OK);  
	  
  }
 @PostMapping("/create")
 public ResponseEntity<Book> CreateBook(@RequestBody Book book) {
	 System.out.println(book);
	    Book b = new Book();
//	      b.setName(book.getName());
//	      b.setLanguage(book.getLanguage());
//	   
//	   Author a= new Author();
//	     a.setAuthName(book.getAuthor().getAuthName());
//	     a.setAuthCity(book.getAuthor().getAuthCity());
//	     b.setAuthor(a);
	   // System.out.println();
	   // System.out.println(book.getAuthor().toString());
	    Book book2 = bs.Savebook(book);
		return new ResponseEntity<>(book2, HttpStatus.CREATED);
	 
 }
}
