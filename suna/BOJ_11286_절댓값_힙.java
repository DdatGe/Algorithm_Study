import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Queue<Integer> list = new PriorityQueue<>((o1,o2)-> {
			if(Math.abs(o1) - Math.abs(o2) == 0)
				return o1- o2;
			return Math.abs(o1) - Math.abs(o2);
		});
		
		for(int i = 0; i<N; i++) {
			int a = sc.nextInt();
			if(a!= 0)
				list.add(a);
			else {
				if(list.isEmpty()) {
					System.out.println(0); continue;
				}
				
				System.out.println(list.poll());
			}
		}
	}
}

//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.List;
//import java.util.Scanner;
//
//public class Main{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		List<Integer> list = new ArrayList<>();
//		for(int i = 0; i<N; i++) {
//			int a = sc.nextInt();
//			if(a!= 0)
//				list.add(a);
//			else {
//				if(list.isEmpty()) {
//					System.out.println(0); continue;
//				}
//				
//				list.sort(new Comparator<Integer>() {
//
//					@Override
//					public int compare(Integer o1, Integer o2) {
//						if(Math.abs(o1) - Math.abs(o2) == 0)
//							return o1- o2;
//						return Math.abs(o1) - Math.abs(o2); // 절댓값에 대해 오름차순
//					}
//					
//				});
//				
//				System.out.println(list.get(0));
//				list.remove(0);
//			}
//		}
//	}
//}
