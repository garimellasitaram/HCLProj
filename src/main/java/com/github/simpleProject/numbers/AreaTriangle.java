package com.github.simpleProject.numbers;

public class AreaTriangle {
	/**
	 * area of a triagle
	 * 
	 * @param base   base in cm
	 * @param height height in cm
	 * @return area of triangle
	 */
	public static double areaTriangle(double base, double height) {

		if (base < 0 || height < 0 ) {
			throw new IllegalArgumentException("Negative values not allowed!");
		}
		return 0.5 * base * height;

	}
}
