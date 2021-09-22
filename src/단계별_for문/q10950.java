package 단계별_for문;

import java.util.Scanner;

public class q10950 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		int[] A = new int[T];
		int[] B = new int[T];
		
		for (int i = 0; i < T; i++) {			
			A[i] = in.nextInt();
			B[i] = in.nextInt();
			
		}
		
		for (int i = 0; i < T; i++)
			System.out.println(A[i] + B[i]);

	}

}
