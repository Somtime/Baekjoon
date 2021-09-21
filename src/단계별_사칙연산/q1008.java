package 단계별_사칙연산;
import java.util.Scanner;

public class q1008 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double A = in.nextDouble();
		double B = in.nextDouble();
		
		if (A > 0 && B < 10) {
			System.out.println(A / B);
		}
		
		in.close();

	}

}
