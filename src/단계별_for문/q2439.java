package �ܰ躰_for��;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class q2439 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		if (N >= 1 && N <= 100) {
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N - i; j++) {
					bw.write(" ");
				}
				for (int k = 1; k <= i; k++) {
					bw.write("*");
				}
				bw.write("\n");
			}			
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
