package Circle;

public class circle {
	public double radius;
	public String color;
	
	public circle() {
		
		}
	public circle( double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	public void setRadius( double radius ) {
		this.radius = radius;
	}
	
	public void setColor( String color ) {
		this.color = color;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public String getColor() {
		return color;
	}
	
	public double getAcreage() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public String toString() {
		return " Bán kính " + getRadius() + " màu " + getColor();
	}
	
	public static void main(String[] args) {
		circle circle = new circle();
		System.out.println(circle);
		circle = new circle(6, "đỏ");
		System.out.println(circle);
		System.out.print("Diện tích hình tròn : " + circle.getAcreage());
		
	}
}
