package Nhapso;
import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
public class Nhapso {

	public static void main (String[] args) {
		Scanner scanln = new Scanner(System.in);
		String str = "";
		double x = 0;
		double t = 0;
		System.out.print("Nhập : ");
		
			str = scanln.nextLine();
			Pattern pattern = Pattern.compile("\\d*");
			Matcher matcher = pattern.matcher(str);
			if (matcher.matches()) {
				x = Integer.parseInt(str);
				t = 1;
				System.out.println("Bạn vừa nhập số : " + str);
			}
			else {
				System.out.println(str + " không phải là số, xin mời bạn nhập lại!!!");
			}
			while (t != 1);
		
		
		
		
	}

}
