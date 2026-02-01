//20260201
//백준 브론즈2 1592 영식이와친구들

import java.io.*;
import java.util.*;

public class BOJ_1592 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //사람 수
        int M = Integer.parseInt(st.nextToken()); //공 받은 횟수
        int L = Integer.parseInt(st.nextToken()); //공 던지는 규칙
        br.close();

        int[] ballCatch = new int[N]; //공 받는 횟수 배열
        int count = 0; //공 던지는 횟수(정답)
        int num = 0; //현재 공을 가지고 있는 번호
        

        ballCatch[num]++; //처음에 1번(index 0)이 공을 받는다

        //공 받은 횟수가 M이 아닐 때만 실행
        while (ballCatch[num] != M) {
            //현재 공 받은 횟수가 홀수이면 시계 방향으로 L번째 있는 사람이 공을 받는다
            if (ballCatch[num] % 2 != 0) {
                num = (num + L) % N;
            } else {
                //현재 공 받은 횟수가 짝수이면 반시계 방향으로 L번째 있는 사람이 공을 받는다
                num = (num - L + N) % N;
            }

            ballCatch[num]++;
            count++;
        }
        
        bw.write(count +"\n");
        bw.flush();
        bw.close();
    }
}