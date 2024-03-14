package com.spring.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int authId;
	private String authName;
	private String authCity;
	@OneToOne(mappedBy = "author")
	private Book book;

	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Author(int authId, String authName, String authCity) {
		super();
		this.authId = authId;
		authName = authName;
		authCity = authCity;
	}

	public int getAuthId() {
		return authId;
	}

	public void setAuthId(int authId) {
		this.authId = authId;
	}

	public String getAuthName() {
		return authName;
	}

	public void setAuthName(String authName) {
		authName = authName;
	}

	public String getAuthCity() {
		return authCity;
	}

	public void setAuthCity(String authCity) {
		authCity = authCity;
	}

	@Override
	public String toString() {
		return "Author [authId=" + authId + ", AuthName=" + authName + ", AuthCity=" + authCity + "]";
	}

}
