import java.util.Scanner;

class dir { 
    int rd = 0, cd = 0, dd = 0;
    public dir() {}
    public dir(int r, int c, int d) { this.rd = r; this.cd = c; this.dd = d; }
}

public class Main {
    static dir[][] dirmap;
    static int[][] map;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        map = new int[N+1][N+1];
        dirmap = new dir[N+1][N+1];
        
        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= N; j++) {
                map[i][j] = sc.nextInt();
                dirmap[i][j] = new dir();
            }
        }
        
        for(int i = 0; i <= N; i++) {
            dirmap[i][0] = new dir();
            dirmap[0][i] = new dir();
        }

        dirmap[1][2].rd = 1; // 여기서부터 시작

        for (int r = 1; r <= N; r++) {
            for (int c = 1; c <= N; c++) {
                if (r == 1 && c <= 2) continue; // 시작점 제외
                dirmap[r][c] = cal(r, c);
            }
        }
        
        System.out.println(dirmap[N][N].rd + dirmap[N][N].cd + dirmap[N][N].dd);
    }
    
    public static dir cal(int r, int c) {
        dir a = new dir();
        if(map[r][c] == 1) return a; // 현재 칸이 벽이면 무조건 0

        a.rd = dirmap[r][c-1].rd + dirmap[r][c-1].cd; // 가로방향: 왼쪽 칸이 가로방향, 대각선 방향

        a.dd = dirmap[r-1][c].dd + dirmap[r-1][c].cd; // 세로방향: 위쪽 칸이 세로방향, 대각선 방향

        // 대각선 방향: 왼쪽 위, 이들 주변에 벽이 없어야
        if(map[r-1][c] == 0 && map[r][c-1] == 0) {
            a.cd = dirmap[r-1][c-1].rd + dirmap[r-1][c-1].cd + dirmap[r-1][c-1].dd;
        }
        
        return a;
    }
}
