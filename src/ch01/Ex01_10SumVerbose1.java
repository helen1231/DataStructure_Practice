package ch01;

import java.util.Scanner;

// 1~n까지의 합 및 그 값을 구하는 과정을 출력
public class Ex01_10SumVerbose1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("n값 입력: ");
			n = stdIn.nextInt();
		}while(n <= 0);

		int sum = 0;
		for(int i = 1; i <= n; i++) {
			if(i < n) 
				System.out.print(i+" + ");
			else
				System.out.println(i+" = ");
			sum += i;
		}
		System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다.");
	}
}
