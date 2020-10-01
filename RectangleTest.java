package edu.ben.assignments.assignment1.test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import student.TestCase;

import edu.ben.assignments.assignment1.Rectangle;

public class RectangleTest extends TestCase {
	Rectangle rect;

	public void setUp() {
		rect = new Rectangle(3, 3);
	}

	@Test
	public void testComputerArea() {
		float output = rect.computeArea(3, 3);
		assertEquals((float) 9, output, 0);
	}

	@Test
	public void testComputePerimeter() {
		float output = rect.computePerimeter(20, 15);
		assertEquals((float) 70, output, 0);
	}

	@Test
	public void testIncreaseDimensions() {
		rect.increaseDimensions(10, 6);
		assertEquals((int) 15, rect.getWidth(), 0);
		assertEquals((int) 11, rect.getLength(), 0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testIncreaseDimensionsEx() {
		rect.increaseDimensions(-1, 5);
	}

	@Test
	public void testComputeDiagonal() {
		float output = rect.computeDiagonal(6, 8);
		assertEquals((float) 10, output, 0);
	}

	@Test
	public void testFindGreaterDimensionW() {
		// Test larger width
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		System.setOut(new PrintStream(output));
		rect.findGreaterDimension(6, 5);

		assertFuzzyEquals("Width is greater", output.toString());
	}

	@Test
	public void testFindGreaterDimensionL() {
		// Test larger length
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		System.setOut(new PrintStream(output));
		rect.findGreaterDimension(4, 7);

		assertFuzzyEquals("Length is greater", output.toString());
	}

	@Test
	public void testFindGreaterDimensionSame() {
		// Tests equal width and length
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		System.setOut(new PrintStream(output));
		rect.findGreaterDimension(5, 5);

		assertFuzzyEquals("Width and length are equal", output.toString());
	}

	@Test
	public void testIsSquare() {
		assertTrue(rect.isSquare());
	}

	@Test
	public void testIsSquareFalse() {
		rect = new Rectangle(7, 15);
		assertFalse(rect.isSquare());
	}
}
