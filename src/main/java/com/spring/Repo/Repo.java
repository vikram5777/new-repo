package com.spring.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.spring.Entity.Book;
@Component
public interface Repo extends CrudRepository<Book, Integer> {

}
