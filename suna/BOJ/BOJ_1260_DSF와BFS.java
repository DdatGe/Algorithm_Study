import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	static int N; 
	static int M;
	static ArrayList<Integer>[] edge;
	static boolean[] visited;
	static Queue<Integer> q;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		N = sc.nextInt(); // 노드 수
		M = sc.nextInt(); // 뎃지 수
		
		int a = sc.nextInt();
		
		
		edge = new ArrayList[N+1];
		// 배열 초기화
		for(int i = 0 ; i<N+1; i++)
			edge[i] = new ArrayList<Integer>();
		visited = new boolean[N+1];
		
		// 입력
		for(int i = 0; i<M; i++) {
			int e1 = sc.nextInt();
			int e2 = sc.nextInt();
			edge[e1].add(e2);
			edge[e2].add(e1);
		}
		
		for(int i = 1; i<=N; i++)
			edge[i].sort(null);
		
		//////////////////////////////////////////////
		/// DFS
		System.out.print(a);
		visited[a] = true;
		DFS(a);
		// 다른 루트를 순회해야할 때: 이미 방문했거나 자식노드가 없는 경우는 제외
//		for(int i = 1; i<=N; i++) {
//			if(!visited[i] && edge[i].size() > 0){ 
//				System.out.print(" 다른 루트 "+i);
//				visited[i] = true;
//				DFS(i);
//			}
//		}
		
		System.out.println();
		
		////////////////////////////////////////////////////
		/// BFS
		visited = new boolean[N+1];
		q = new LinkedList<>();
		visited[a] = true;
		BFS(a);
		
	}
	
	public static void DFS(int node) {
		for(int i = 0; i<edge[node].size(); i++) {
			int child = edge[node].get(i);
			if(!visited[child]) {// 방문 안했으면~
				System.out.print(" "+child);
				visited[child] = true;
				DFS(child);
			}
		}
	}
	
	public static void BFS(int node) {
		// 방문 안한 애들만 queue에 넣음- 출력, 방문 true로 - bfs
		System.out.print(node+" ");
		
		for(int i = 0 ; i<edge[node].size(); i++) {
			if(!visited[edge[node].get(i)]) {
				visited[edge[node].get(i)] = true;
				q.add(edge[node].get(i));
			}
		}
		
		
		if(!q.isEmpty()) BFS(q.poll());
	}
}
