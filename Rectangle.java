package edu.ben.assignments.assignment1;

/**
 * Rectangle class represents a rectangle that gets initialized, and then shows
 * the Area, Perimeter etc.
 * 
 * @author Aakif Ziauddin
 * @version 1.0
 */

public class Rectangle {

	private float width, length;

	/**
	 * Rectangle is made with a given length and width
	 * 
	 * @param width
	 * @param length
	 */

	public Rectangle(float width, float length) {
		this.width = width;
		this.length = length;
	}

	/**
	 * The Area of the rectangle is computed and returned
	 * 
	 * @param w is the width of the rectangle
	 * @param l is the length of the rectangle
	 * @return the product (Area) of the width and length
	 */
	public float computeArea(float w, float l) {
		return (w * l);
	}

	/**
	 * The Perimeter of the rectangle is computed and returned
	 * 
	 * @param w is the width of the rectangle
	 * @param l is the length of the rectangle
	 * @return the sum (Perimeter) of the width and length
	 */
	public float computePerimeter(float w, float l) {
		return (2 * w + 2 * l);
	}

	/**
	 * Increases the width and length of the original width and length of the
	 * rectangle by giving the newwidth and new length
	 * 
	 * @param newWidth  is the variable that increases the width
	 * @param newLength is the variable that increases the length
	 */
	public void increaseDimensions(int newWidth, int newLength) {
		if (newWidth <= 0 || newLength <= 0) {
			throw new IllegalArgumentException();
		}
		width += newWidth;
		length += newLength;
	}

	/**
	 * 
	 * @param w is the width of the rectangle
	 * @param l is the length of the rectangle
	 * @return the diagonal length of the rectangle
	 */
	public float computeDiagonal(float w, float l) {
		return (float) (Math.sqrt(w * w + l * l));
	}

	/**
	 * Checks and prints out if the rectangle width is greater than the length or if
	 * the rectangle length is greater than the width, or the width and length of
	 * the rectangle are equal.
	 * 
	 * @param w is the width of the rectangle
	 * @param l is the length of the rectangle
	 */
	public void findGreaterDimension(float w, float l) {
		if (w > l) {
			System.out.println("Width is greater");
		} else if (w < l) {
			System.out.println("Length is greater");
		} else {
			System.out.println("Width and length are equal");
		}
	}

	/**
	 * Checks to see if the length and width are equal to each other to see if the
	 * rectangle is a square
	 * 
	 * @return true if length and width equal each other, false if length and width
	 *         aren't equal to each other
	 */

	public boolean isSquare() {
		return (length == width);
	}

	/**
	 * Gets the rectangle's width
	 * 
	 * @return the width of the rectangle
	 */

	public float getWidth() {
		return width;
	}

	/**
	 * Gets the rectangle's length
	 * 
	 * @return the length of the rectangle
	 */
	public float getLength() {
		return length;
	}

}