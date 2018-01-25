package com.giaduc.java4.model;

public class Order_item {

	private int id;
	private int order_id;
	private int book_id;
	private int amount;

	public Order_item() {
		super();
	}

	public Order_item(int id, int order_id, int book_id, int amount) {
		super();
		this.id = id;
		this.order_id = order_id;
		this.book_id = book_id;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
