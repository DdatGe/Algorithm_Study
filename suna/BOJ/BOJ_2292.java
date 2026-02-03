package test;

import java.util.Scanner;

public class test { // Main

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int i = 0; // 1을 둘러싸는 i 번째 껍질. 지나야할 방 수는 i+1
		while (true) {
			// i번쩨 껍질에 포함되는 방들은 1+6+6*2+...6*i=1+3*(i*(i+1))까지.
			int crit = 1 + 3 * (i * (i + 1));
			if (crit >= a) { // crit(i) 보다 작으면 a는 i껍질에 존재
				break;
			}
			i++;

		}

		System.out.println(i + 1);

	}
}
