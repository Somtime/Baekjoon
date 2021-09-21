package 단계별_사칙연산;
import java.util.Scanner;

public class q10869 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		
		if (A >= 1 && B <= 10000) {
			System.out.println(A + B);
			System.out.println(A - B);
			System.out.println(A * B);
			System.out.println(A / B);
			System.out.println(A % B);
		}
	}

}
