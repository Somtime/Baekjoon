package 단계별_for문;

import java.util.Scanner;

public class q2739 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		if (N >= 1 && N <= 9) {
			for (int i = 1; i <= 9; i++) {
				System.out.println(N + " * " + i + " = " + N * i);
			}
		}
		
	}

}
