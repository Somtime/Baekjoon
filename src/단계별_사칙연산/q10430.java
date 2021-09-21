package 단계별_사칙연산;
import java.util.Scanner;

public class q10430 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		
		if ((2 <= A && A <= 10000) && (2 <= B && B <= 10000) && (2 <= C && C <= 10000)) {
			System.out.println((A + B) % C);
			System.out.println(((A % C) + (B % C)) % C);
			System.out.println((A * B) % C);
			System.out.println(((A % C) * (B % C)) % C);
		}

	}

}
