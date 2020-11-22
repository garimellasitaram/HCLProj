package com.github.simpleProject.numbers;

import java.util.stream.IntStream;

public class PrintNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream numbers= IntStream.rangeClosed(1, 10);
		numbers.forEach(System.out::println);
	}

}
