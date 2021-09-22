package �ܰ躰_for��;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class q10871 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		if ((N >= 1 && N <= 10000) && (X >= 1 && X <= 10000)) {
			int[] A = new int[N];
			st = new StringTokenizer(br.readLine());
			
			for (int i = 0; i < N; i++) {	
				A[i] = Integer.parseInt(st.nextToken());
				
				if (A[i] < X)
					bw.write(A[i] + " ");
			}
		}
		br.close();
		bw.flush();
		bw.close();

	}

}
