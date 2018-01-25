package com.giaduc.java4.model;

public class Order {

	private int id;
	private String order_no;
	private int customer_id;

	public Order() {
		super();
	}

	public Order(int id, String order_no, int customer_id) {
		super();
		this.id = id;
		this.order_no = order_no;
		this.customer_id = customer_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrder_no() {
		return order_no;
	}

	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

}
