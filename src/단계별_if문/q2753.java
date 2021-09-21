package 단계별_if문;

import java.util.Scanner;

public class q2753 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int year = in.nextInt();
		
		if (year >= 1 && year <= 4000) {
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
				System.out.println(1);
			else 
				System.out.println(0);
		} 

	}

}
