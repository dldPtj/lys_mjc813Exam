package com.example.demo.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CommonExceptionTemplate extends Exception{
	private int code;
	private String message;
}
