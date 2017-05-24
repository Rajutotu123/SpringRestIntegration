package com.sri.service;

public class BookInfoService {
	public float getBookPrice(String isbn) {
		if (isbn.equals("isbn101")) {
			return 500;
		} else if (isbn.equals("isbn102")) {
			return 400;
		}
		return 600;
	}
}
