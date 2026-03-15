import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Main{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		TreeMap<String, Integer> tm = new TreeMap<>();
		
		int N = Integer.parseInt(br.readLine());
		for(int i = 0 ; i<N; i++) {
			String str = br.readLine();
			String exp = null;
			for(int j = 0; j<str.length(); j++) {
				if(str.charAt(j) == '.') {
					exp = str.substring(j+1);
				}
			}
			
			tm.put(exp, tm.getOrDefault(exp, 0)+1);
		}
		
		for(String k: tm.keySet()) {
			System.out.print(k+" "+tm.get(k)+"\n");
		}
	}
}
