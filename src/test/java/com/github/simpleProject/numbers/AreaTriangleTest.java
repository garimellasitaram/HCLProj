package com.github.simpleProject.numbers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AreaTriangleTest {

	@Test
	public void area_triangle_test() {
		assertEquals(5, AreaTriangle.areaTriangle(2, 5));
	}

	@Test
	public void are_triangle_negative_numbers_test() {
		assertThrows(IllegalArgumentException.class, () -> {
			AreaTriangle.areaTriangle(-2, 5);
		});

	}
}
