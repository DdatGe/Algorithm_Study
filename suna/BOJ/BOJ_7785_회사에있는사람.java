import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		TreeSet<String> ts = new TreeSet<>();

		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			st.nextToken();
			if (ts.contains(name))
				ts.remove(name);
			else
				ts.add(name);
		}
	
		for (String a : ts.descendingSet())
			System.out.println(a);
		
		//sol2. method 안쓴다면
//		List<String> ar = new ArrayList<>();
//		for(String a: ts) {
//			ar.add(a);
//		}
//		
//		for(int i = ar.size()-1; i>= 0 ; i--)
//			System.out.println(ar.get(i));
	}
	
	
}
