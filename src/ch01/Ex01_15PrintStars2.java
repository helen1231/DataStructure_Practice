package ch01;

import java.util.Scanner;

// *를 n개 출력, w개마다 줄바꿈(2, if문 중복 실행 개선)
public class Ex01_15PrintStars2 {
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
		
		for(int i = 0; i < n/w; i++) {
			System.out.println("*".repeat(w));
		}
		
		int rest = n % w;
		if(rest != 0)
			System.out.println("*".repeat(rest));
	}
}
