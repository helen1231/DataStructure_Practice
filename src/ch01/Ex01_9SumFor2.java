package ch01;

import java.util.Scanner;

// 양수만 입력받아 1~n까지의 합을 구함
public class Ex01_9SumFor2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		
		do {
			System.out.println("n의 값: ");
			n = stdIn.nextInt();
		}while(n <= 0);
		
		int sum = 0;
		for(int i = 0; i <= n; i++) {
			sum += i;
		}
		
		System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다.");
	}
}
