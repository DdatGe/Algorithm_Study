
import java.util.Scanner;

public class BOJ_2563 { // Main

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 입력
		int t = sc.nextInt();
		int[][] map = new int[100][100]; // 흰색 도화지
		int cnt = 0;

		// 검은 영역 계산
		for (int i = 0; i < t; i++) { 
			//i번째 색종이의 왼쪽아래 좌표
			int x = sc.nextInt();
			int y = sc.nextInt();
			// map상에 i번째 종이가 가린 부분을 1로 바꾸고 바뀐 경우 cnt +1
			for (int a = x; a < x + 10; a++) {
				for (int b = y; b < y + 10; b++) {
					if (map[a][b] == 0) {
						map[a][b] = 1;
						cnt += 1;
					}
				}
			}
		}
		//출력
		System.out.println(cnt);

	}

}
