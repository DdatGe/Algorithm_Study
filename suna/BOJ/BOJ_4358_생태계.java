import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		TreeMap<String, Double> tm = new TreeMap<>();
		int cnt = 0;
		String input = br.readLine();
		while (input != null && !input.isEmpty()) { // input!= null을 해야 널포인트 에러가 안난다. 
			if (!tm.containsKey(input)) {
				tm.put(input, (double) 1);
				cnt++;
			} else {
				double tmp = tm.get(input);
				tm.remove(input);
				tm.put(input, tmp + 1);
				cnt++;
			}
			input = br.readLine();
		}
		StringBuilder sb = new StringBuilder();
		for (String str : tm.keySet()) {
			sb.append(str).append(" ").append(String.format("%.4f\n", (tm.get(str) / cnt * 100)));
		}

		System.out.println(sb);

	}
}

// scanner 사용하는 경우
ain {
//	public static void main(String[] args) throws IOException {
//		Scanner sc = new Scanner(System.in);
//		TreeMap<String, Double> tm = new TreeMap<>();
//		int cnt = 0;
//		while (sc.hasNextLine()) { // scanner로 처리하려면 isEmpty()로 체크 
//			String input = sc.nextLine();
//			if (input.isEmpty()) break;
//			if (!tm.containsKey(input)) {
//				tm.put(input, (double) 1);
//				cnt++;
//			} else {
//				double tmp = tm.get(input);
//				tm.remove(input);
//				tm.put(input, tmp + 1);
//				cnt++;
//			}
//		}
//		StringBuilder sb = new StringBuilder();
//		for (String str : tm.keySet()) {
//			sb.append(str).append(" ").append(String.format("%.4f\n", (tm.get(str) / cnt * 100)));
//		}
//
//		System.out.println(sb);
//
//	}
//}
