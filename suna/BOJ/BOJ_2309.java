
import java.util.Arrays;
import java.util.Scanner;

public class Main { // Main

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] A = new int[9];
		for (int i = 0; i < 9; i++)
			A[i] = sc.nextInt();
		Arrays.sort(A); // 먼저 정렬

		// (전부 더한 값 - 100) 만큼을 만드는 난쟁이 세트를 찾자.
		int target = -100;
		for (int a : A)
			target += a;
		
		// 난쟁이가 아닌 애들의 인덱스들 찾기
		int a = 0;
		int b = 0;

		wholeroof: for (int i = 0; i < 8; i++) {
			for (int j = i + 1; j < 9; j++) {
				if (target == (A[i] + A[j])) {
					a = i;
					b = j;
					break wholeroof;
				}
			}
		}
		
		// 난쟁이 아닌 애들 제외하고 전부 출력
		for (int i = 0; i < 9; i++) {
			if (i != a && i != b)
				System.out.println(A[i]);
		}

	}
}
