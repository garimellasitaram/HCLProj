package com.github.simpleProject.numbers;

public class AreaTriangle {

	/**
	 * Calculate Area of triangle
	 * 
	 * @param a side of a triangle
	 * @param b side of a triangle
	 * @param c side of a triangle
	 * @return Area of a triangle
	 */
	public static double areaTriangle(double a, double b, double c) {
		if (a < 0 || b < 0 || c < 0) {
			throw new IllegalArgumentException("Negative values not allowed!");
		}

		if ((a + b < c) || (b + c < a) || (c + a < b)) {
			throw new IllegalArgumentException("One Side can't be greater than other two !");
		}

		double s = (a + b + c) / 2;

		return Math.sqrt(s * (s - a) * (s - b) * (s - c));

	}
}
