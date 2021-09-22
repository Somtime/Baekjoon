package 단계별_for문;

import java.util.Scanner;

public class q8393 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		if (n >= 1 && n <= 10000) {
			int sum = 0;
			for (int i = 0; i <= n; i++) {
				sum += i;
			}
			System.out.println(sum);
		}

	}

}
