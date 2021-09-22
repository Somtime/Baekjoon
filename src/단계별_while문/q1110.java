package 단계별_while문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class q1110 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int cycle = 0;
		
		if (N >= 0 && N <= 99) {
			int units = N % 10;
			int tens = (N / 10) % 10;

			int tmp = units * 10 + ((tens + units) % 10);
			cycle += 1;
			
			while (N != tmp) {
				units = tmp % 10;
				tens = (tmp / 10) % 10;
				
				tmp = units * 10 + ((tens + units) % 10);
				cycle += 1;
				
			}
			bw.write(cycle + "\n");
			
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
