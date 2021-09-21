package 단계별_사칙연산;
import java.util.Scanner;

public class q2588 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		int tmp = B;
		int length = (int) Math.log10(B) + 1; // B의 길이
		int result = 0; 
		int time = 0;
		
		for (int i = 1; i <= length; i++) {
			System.out.println(A * (tmp % 10));
			result += A * (tmp % 10) * Math.pow(10, time);
			
			if (i == length) {
				System.out.println(result);
			}
			tmp /= 10;
			time += 1;
			
		}

	}

}
