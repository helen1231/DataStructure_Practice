package ch01;

import java.util.Scanner;

// 반복과정에서 조건 판단(+,-부호를 번갈아 출력)
public class Ex01_12Alternative1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("+와 -를 번갈아 n개 출력합니다.");

		do {
			System.out.println("n 값:");
			n = stdIn.nextInt();
		}while(n <= 0);
		
		for(int i = 0; i < n; i++)
			if(i % 2 == 0)
				System.out.print("+");	// 짝수
			else
				System.out.print("-");	// 홀수
		
		// 혹은! 
		
		System.out.println();
		for (int i = 1; i <= n; i++)
			if (i % 2 == 0)				// 홀수
				System.out.print("-");
			else						// 짝수
				System.out.print("+");
	}

}
/* 문제점
 *  1. 반복할 때마다 if문 실행
 *  2. 변경할 때 유연하게 대응하기 어려움
 *  	e.g. i값이 0이 아니라 1부터 시작한다면? - for 문전체 수정 필요
 */
