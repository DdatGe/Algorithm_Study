import java.util.Scanner;

public class Main {
	static int N = 0;
	static int totcnt = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();

		rect(1);

		System.out.println(totcnt);
	}

	public static void rect(int n) {
		if (n > N) {
			return;
		}

		for (int R = 1; R <= ((int) Math.sqrt(n)); R++) {
			if (n % R == 0)
				totcnt++;
		}
		rect(n + 1);
	}

}
