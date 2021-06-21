package Cong;
import java.util.Scanner;
public class Mang {
	
	public static void main(String[] args) {
		int arr[] = new int[9];
		int tempt;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 9; i++) {
			System.out.print("Phần tử thứ "+ (i+1) + " là: ");
			arr[i] = sc.nextInt();
		}
	
		System.out.println("\nMảng ban đầu là: ");
			for ( int i = 0; i < 9; i++) {
			System.out.print(arr[i] + "\t");
			}
		for ( int i = 0; i < 8 ; i++) {
			for ( int j = i+1 ; j < 9; j++) {
				if ( arr[i] < arr[j]) {
					tempt = arr[i];
					arr[i] = arr[j];
					arr[j] = tempt;
				}
			}
		}	
		System.out.println("\nPhần tử lớn nhất mảng là : " + arr[0]);
		/*for(int i = 0; i < 8; i++) {
			for ( int j = i+1; j < 9; j++ ) {
				if ( arr[i] == arr[j]) {
					i++;
				}
				else {
					System.out.println("Phần tử lớn thứ hai mảng là : " + arr[j]);
					break;
				}
			}
		}*/
		System.out.println("Phần tử lớn thứ hai mảng là : " + arr[1]);
		System.out.println("Phần tử bé nhất mảng là : " + arr[8]);
		
		
	}
}
