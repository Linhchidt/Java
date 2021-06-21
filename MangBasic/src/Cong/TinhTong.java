package Cong;
import java.util.Scanner;

public class TinhTong {
	public static void main(String[] args) {
		System.out.print("Nhập số N = ");
		Scanner sc = new Scanner( System.in );
		int n = sc.nextInt();
		int sum1 = 2;
		int sum2 = 0;
		int sum = 0;
		if ( n < 2 ) {
			System.out.print("Vui lòng nhập số nguyên lớn hơn 1!");
		}
		else {
			for ( int i = 2; i <= n ; i++) {
				for ( int j = 2; j <= Math.sqrt(n); j++ ) {
					if ( i % j != 0) {
						sum1 += i;
					}
				}
				if (i % 2 == 0) {
					sum2 += i;
				}
				
			}
			sum = sum1 + sum2;
			System.out.print("Tong = " + sum);
			
		}
	}
}
