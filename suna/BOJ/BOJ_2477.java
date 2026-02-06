import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt(); // 제곱미터당 참외수
		int[] map = new int[6];
		int[] dir = new int[6];

		for (int i = 0; i < 6; i++) {
			dir[i] = sc.nextInt(); // 동1서2남3북4
			map[i] = sc.nextInt();
		}

		int maxrow = 0, maxcol = 0;
		int maxrow_idx = 0, maxcol_idx = 0;

		for (int i = 0; i < 6; i++) {
			if (dir[i] <= 2) { // 가로방향 최대 길이, 인덱스
				if (maxrow <= map[i]) {
					maxrow = map[i];
					maxrow_idx = i;
				}
			} else {// 세로방향 최대길이, 인덱스
				if (maxcol <= map[i]) {
					maxcol = map[i];
					maxcol_idx = i;
				}
			}
		}

		// 전체 사각형 - 내측 작은 사각형
		// 작은 사각형의 변은 큰 변 옆에 붙어있는 두 변의 차이와 같다.
		int minlen1 = Math.abs(map[(maxcol_idx + 1) % 6] - map[(maxcol_idx + 5) % 6]);
		int minlen2 = Math.abs(map[(maxrow_idx + 1) % 6] - map[(maxrow_idx + 5) % 6]);

		int res = maxcol * maxrow - minlen1 * minlen2;

		System.out.println(res * k);
	}
}