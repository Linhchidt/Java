package TinhsNghiemPT;
import java.util.Scanner;
public class TinhNghiem {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main (String[] args) {
		System.out.print("Nhập hệ số bậc 2, a = ");
		float a = TinhNghiem.scanner.nextFloat();
		System.out.print("Nhập hệ số bậc 1, b = ");
		float b = TinhNghiem.scanner.nextFloat();
		System.out.print("Nhập hằng số tự do, c = ");
		float c = TinhNghiem.scanner.nextFloat();
		TinhNghiem.giaiPTbac2(a, b, c);
	}
	public static void giaiPTbac2( float a, float b, float c) {
		if ( a == 0 ) {
			if ( b == 0 ) {
				System.out.println("Phương trình vô nghiệm!!!");
			} else {
				System.out.println("Phương trình có một nghiệm : " + "x = "+ (-c/b));
			}
			return;
		}
		float delta = b*b - 4*a*c;
		float x1;
		float x2;
		if (delta > 0) {
			x1 = (float) ((-b + Math.sqrt(delta))/(2*a));
			x2 = (float) ((-b - Math.sqrt(delta))/(2*a));
			System.out.println("Phương tình có 2 nghiệm phân biệt : " + "x1 = " + x1 + " và x2 = " + x2);
	
		} else if (delta == 0) {
			x1 = (-b / (2*a));
			System.out.println("Phương trình có 2 nghiệm kép : " + "x1 = x2 = "+ x1);
			
		} else {
			System.out.println("Phương trình vô nghiệm!!!");
		}
	}
}
