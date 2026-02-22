import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = 0;
		int[] list = new int[10];

		mainloop: for (int i = 0; i < 10; i++) {
			int res = sc.nextInt() % 42;
			for (int j = 0; j < size; j++) {
				if (list[j] == res)
					continue mainloop;
			}
			list[size++] = res;
		}
		
		System.out.println(size);
	}
}
