package com.example.demo.exception;

public class GlobalExceptionHandler extends Exception {
	private static final long serialVersionUID = -8391354025464897255L;

	public GlobalExceptionHandler(String s) {
		super(s);
	}
}
