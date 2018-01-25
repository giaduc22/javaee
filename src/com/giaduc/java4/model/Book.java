package com.giaduc.java4.model;

public class Book {

	private int id;
	private String title;
	private double price;
	private double weight;
	private String image;
	private int number_of_pages;
	private int category;
	private int author_id;

	public Book() {
		super();
	}

	public Book(int id, String title, double price, double weight, String image, int number_of_pages, int category,
			int author_id) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.weight = weight;
		this.image = image;
		this.number_of_pages = number_of_pages;
		this.category = category;
		this.author_id = author_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getNumber_of_pages() {
		return number_of_pages;
	}

	public void setNumber_of_pages(int number_of_pages) {
		this.number_of_pages = number_of_pages;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public int getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}
	
	

}
