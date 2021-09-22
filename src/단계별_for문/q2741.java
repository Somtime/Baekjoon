package 단계별_for문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class q2741 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		if (N > 0 && N <= 100000) {
			for (int i = 1; i <= N; i++) {
				bw.write(i + "\n");
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
