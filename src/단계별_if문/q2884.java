package �ܰ躰_if��;

import java.util.Scanner;

public class q2884 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int H = in.nextInt(); // ��
		int M = in.nextInt(); // ��
		in.close();
		
		if ((H >= 0 && H <= 23) && (M >= 0 && M <= 59)) {
			if (M < 45) {
				H--;
				M += 15;
				if (H < 0)
					H = 23;
			} else {
				M -= 45;
			}
			System.out.println(H + " " + M);
		}
		
	}

}
