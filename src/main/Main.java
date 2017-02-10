package main;

import factory.DefaultPolygonFactory;
import factory.PolygonFactory;
import figures.RegularPolygon;
import input.DefaultInputValidator;
import input.InputValidator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {

		BufferedReader br = null;
		InputValidator validator = new DefaultInputValidator();
		PolygonFactory factory = new DefaultPolygonFactory();

		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Calculating polygon started...");
			polygonInfoOutput();
			String sideQuantity = br.readLine();

			System.out.println("Input polygon side length (mm):");
			String sideLength = br.readLine();

			if(!validator.validateCreate(sideQuantity, sideLength)) {
				System.out.println("Polygon is not valid: either side quantity or side length is incorrect.");
				System.out.println("Exiting...");
				return;
			}

			RegularPolygon polygon = factory.getRegularPolygon
					(Integer.valueOf(sideQuantity), BigDecimal.valueOf(Double.valueOf(sideLength)));

			polygonResultOutput(polygon);

		} catch (IOException e) {
			System.out.println("Internal error, exiting...");
		}

	}

	private static void polygonInfoOutput() {
		System.out.println("Input side quantity:");
		System.out.println("Triangle: 3");
		System.out.println("Square: 4");
		System.out.println("Pentagon: 5");
		System.out.println("Hexagon: 6");
		System.out.println("--------------");
	}

	private static void polygonResultOutput(RegularPolygon polygon) {
		System.out.println("Polygon: " + polygon.getName());
		System.out.println("Area: " + polygon.getArea(polygon.getSideLength()));
		System.out.println("Perimeter: " + polygon.getPerimeter(polygon.getSideLength()));
		System.out.println("Exiting.....");
	}
}
