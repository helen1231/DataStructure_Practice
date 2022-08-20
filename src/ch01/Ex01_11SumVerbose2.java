package ch01;

import java.util.Scanner;

// 1~n까지의 합을 구함(n은 양의 정수, 덧셈 내용도 표기, 반복 줄이기)
public class Ex01_11SumVerbose2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다!");
		int n;
		
		do {
			System.out.println("n 값: ");
			n = stdIn.nextInt();
		}while(n <= 0);
		
		int sum = 0;
		for(int i = 1; i < n; i++) {	// Ex01_10SumVerbose1 대비 for문 반복이 1번 감소
			System.out.print(i+" + ");
			sum += i;
		}
		
/*		System.out.println(n+" = ");
		sum += n;
		System.out.println(sum);
*/
		
		// /*~*/를 간단히 
		System.out.println(n+" = "+(sum+=n));
	}
}
