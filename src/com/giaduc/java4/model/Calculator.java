package com.giaduc.java4.model;

public class Calculator {

	private int a;
	private int b;

	public Calculator() {
		super();
	}

	public Calculator(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public double sum(int a, int b) {
		return a + b;
	}

	public double sub(int a, int b) {
		return a - b;
	}

	public double mul(int a, int b) {
		return a * b;
	}

	public double div(int a, int b) {
		return a / b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
}
