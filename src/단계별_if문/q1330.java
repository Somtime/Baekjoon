package �ܰ躰_if��;

import java.util.Scanner;

public class q1330 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		
		if ((A >= -10000 && A <= 10000) && (A >= -10000 && A <= 10000)) {
			if (A > B) {
				System.out.println(">");
			} else if (A < B) {
				System.out.println("<");
			} else {
				System.out.println("==");
			}
		}

	}

}
