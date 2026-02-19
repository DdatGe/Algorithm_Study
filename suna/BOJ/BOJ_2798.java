import java.util.Scanner;

public class Main {
	static int M;
	static int N;
	static int[] input;
	static int[] sel;
	static int maxval; 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		sel = new int[3];
		maxval = 0; 
		
		input = new int[N];
		for(int i = 0; i<N; i++)
			input[i] = sc.nextInt();
		
		// 조합문제
		
		combination(0,0);
		
		System.out.println(maxval);
	}
	
	public static void combination(int idx, int sidx) {
		if(sidx == 3) {
			int sum = sel[0]+sel[1]+sel[2];
			if(sum <= M && sum > maxval)
				maxval = sum;
			return;
		}
		
		if(idx == N)
			return;
		
		sel[sidx] = input[idx];
		combination(idx+1, sidx+1);
		
		combination(idx+1, sidx);
		
	}
}
