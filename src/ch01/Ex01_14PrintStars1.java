package ch01;

import java.util.Scanner;

// *를 n개 출력, w개마다 줄바꿈
public class Ex01_14PrintStars1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n, w;
		
		System.out.println("*를 n개 출력, w개마다 줄바꿈");
		
		do {
			System.out.println("n값: ");
			n = stdIn.nextInt();
		}while(n <= 0);

		do {
			System.out.println("w값: ");
			w = stdIn.nextInt();
		}while(w <= 0);
		
		for(int i = 0; i < n; i++) {
			System.out.print("*");
			if(i % w == w - 1)
				System.out.println();
		}
		if(n % w != 0)
			System.out.println();
	}
}
