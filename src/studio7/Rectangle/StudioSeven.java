package studio7.Rectangle;

import edu.princeton.cs.introcs.StdDraw;
	

public class StudioSeven {
	
	public static void main(String[] args) { 
	
		
		Rectangle box = new Rectangle(2.0, 3.0);
		
		System.out.print(box.isSquare());
	}
}
	
	class Rectangle {
		
	
	private double length;
	private double width;

	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	public double getArea() {
		return length * width;
	}
	public double getPerimeter() {
		return 2 * (length + width);
	}
	public boolean isSquare() {
		return length == width;
		
	}

	public boolean isSmallerThan(Rectangle other) {
		return this.getArea() < other.getArea();
	}

	// Method to draw the rectangle using StdDraw
	public void draw() {
		double centerX = 0.5;
		double centerY = 0.5;
		StdDraw.rectangle(centerX, centerY, length / 2, width / 2);
	}
//	*public static void main(String[] args) {
//		Rectangle rect1 = new Rectangle(5, 3);
//		Rectangle rect2 = new Rectangle(4, 4);
//
//		System.out.println("Rectangle 1 Area: " + rect1.getArea());
//		System.out.println("Rectangle 1 Perimeter: " + rect1.getPerimeter());
//
//		System.out.println("Rectangle 1 is square: " + rect1.isSquare());
//
//		System.out.println("Rectangle 1 is smaller than Rectangle 2: " + rect1.isSmallerThan(rect2));
//		rect1.draw();
//		rect2.draw();
//	}
//	
	
	public class Die {
		
		private double sides;
		
		public Die (int dieSides) {
			
			sides = dieSides;			
		}
		
		private int roll() {
			
			int dotNumber = (int)(Math.random()*this.sides) +1;
			
			return dotNumber;
			
		}
		
	}
		
		
	}








