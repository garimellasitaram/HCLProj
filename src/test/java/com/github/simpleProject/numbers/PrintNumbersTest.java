package com.github.simpleProject.numbers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PrintNumbersTest {

	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	@BeforeEach
	public void setUp() {
		System.setOut(new PrintStream(outputStreamCaptor));
	}

	@Test
	void givenSystemOutRedirection_whenInvokePrintln_thenOutputCaptorSuccess() {

		Numbers.printNumbers();
		assertEquals("1,2,3,4,5,6,7,8,9,10", outputStreamCaptor.toString());
	}

	@AfterEach
	public void tearDown() {
		System.setOut(standardOut);
	}

}
