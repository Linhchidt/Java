package Cong;
import java.util.Scanner;

public class Hieu {
	public static void main (String[] args) {
		System.out.print("Nhập số chẵn N = ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int hieu = 0;
		int sum1 = 0;
		int sum2 = 0;
		if (n % 2 == 0) {
			for ( int i = 0; i <= n/2; i++) {
				sum1 += i;
			}
			for ( int j = n/2; j <= n; j++) {
				sum2 += j;
			}
			hieu = sum2 - sum1;
			System.out.print("Hieu của tong các số từ " + n/2 + " đến " + n + ""
					+ " và tổng các số từ 0 đến " + n/2 + " là : " + hieu );
		}
		
		else {
			System.out.print("Đây là số lẻ, vui lòng nhập lại!!!");
		}
	}
	
}
