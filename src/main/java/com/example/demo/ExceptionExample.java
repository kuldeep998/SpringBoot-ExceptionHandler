package com.example.demo;

import com.example.demo.exception.GlobalExceptionHandler;

public class ExceptionExample {

	public static void main(String[] args) throws GlobalExceptionHandler {

		try {

			String email = "kuldeepargal998@gmail.com";
			if (email.equals("kuldeepargal998@gmail.com")) {
				throw new GlobalExceptionHandler("User already exist with that email");
			} else {
				System.out.println("successfully saved");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
