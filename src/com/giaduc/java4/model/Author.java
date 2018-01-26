package com.giaduc.java4.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;

@Entity
@Table(name = "author")
public class Author {

	private int id;
	private String name;

	public Author() {
		super();
	}

	public Author(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
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

}
