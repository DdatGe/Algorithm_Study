import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int[] T = new int[N + 1];
        int[] P = new int[N + 1];
        // dp[i]는 i일 "전까지" 일해서 번 최대 수익
        // i + T[i]가 N + 1이 될 수 있으므로 크기를 충분히 잡습니다.
        int[] dp = new int[N + 2]; 

        for (int i = 1; i <= N; i++) {
            T[i] = sc.nextInt();
            P[i] = sc.nextInt();
        }

        for (int i = 1; i <= N; i++) {
            // 1. 현재까지의 최대 수익을 다음 날로 전파 (상담을 안 하는 경우 대비)
            dp[i + 1] = Math.max(dp[i + 1], dp[i]);

            // 2. 오늘 상담을 하는 경우
            int endDay = i + T[i];
            if (endDay <= N + 1) {
                // 상담이 끝나는 날의 수익을 갱신
                dp[endDay] = Math.max(dp[endDay], dp[i] + P[i]);
            }
        }

        // N+1일째에 쌓인 최종 수익 출력
        System.out.println(dp[N + 1]);
    }
}
