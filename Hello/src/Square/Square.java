package Square;
import java.util.Scanner;
public class Square {
	double side ;
	
	public Square() {
		
	}
	public Square(double side ) {
		this.side = side;
		
	}
	public double getArea() {
		return this.side * this.side;
	}
	public double getPerimeter() {
		return this.side * 4;
	}
	public String display() {
		return "Square {" + " side " + side + " }";
	}
	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		System.out.print("Enter the side: ");
		double side = scanner.nextDouble();
		
		Square square = new Square(side);
		System.out.println("Your Square \n" + square.display());
		System.out.println("Perimeter of Square : \n" + square.getPerimeter());
		System.out.println("Area of Square : \n" + square.getArea());
		
	}
}
