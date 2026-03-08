import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] a = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++)
			a[i] = Integer.parseInt(st.nextToken());

		
		int gmin = a[0];
		int p = 0;
		for(int i = 1; i<N;i++) {
			//들어온게 gmin보다 작으면 -> gmin 업데이트
			if(a[i]<gmin)
				gmin = Math.min(gmin, a[i]);
			//들어온게 gmin보다 크면 -> p업데이트
			else
				p= Math.max(p, a[i]-gmin);
		}
		
		System.out.println(p);
	}
}
