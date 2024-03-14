package com.spring.Entity;

import org.hibernate.annotations.Cascade;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Book {
@Id 
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id ;
private String name ;
private  String language;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "auth_id",referencedColumnName = "authId")
private Author author;
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
public Book( String name, String language, Author author) {
	super();
	//this.id = id;
	this.name = name;
	this.language = language;
	this.author = author;
}
@Override
public String toString() {
	return "Book [id=" + id + ", name=" + name + ", language=" + language + ", author=" + author + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLanguage() {
	return language;
}
public void setLanguage(String language) {
	this.language = language;
}
public Author getAuthor() {
	return author;
}
public void setAuthor(Author author) {
	this.author = author;
}

}
