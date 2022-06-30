package com.kh.object;

import com.kh.object.practice.Book;

public class Application {

	public static void main(String[] args) {
		Book book = new Book(null, 0, 0, null);
		Book book2 = new Book("자바의정석", 20000, 0.2, "윤상섭");
		
		String result = book.information();
		System.out.println(result);
		result = book2.information();
		System.out.println(result);
		System.out.println("========================");
		
		book.setTitle("C언어");
		book.setPrice(30000);
		book.setDiscountRate(0.1);
		book.setAuthor("홍길동");
		
		System.out.println("수정된 결과 확인");
		System.out.println(book.information());
		System.out.println("========================");
		
		System.out.println("도서명 = " + book.getTitle());
		System.out.println("할인된 가격 = " + (int)(book.getPrice() * (1 - book.getDiscountRate()))+ "원");
		System.out.println("도서명 = " + book2.getTitle());
		System.out.println("할인된 가격 = " + (int)(book2.getPrice() * (1 - book2.getDiscountRate()))+ "원");
		
		
	}

}
