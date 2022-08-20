package ch01;

import java.util.Scanner;

// 반복과정에서 조건 판단(+,-부호를 번갈아 출력)2 - 조건변경
public class Ex01_13Alternative2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("+와 -를 번갈아 n개 출력합니다.");

		do {
			System.out.println("n 값:");
			n = stdIn.nextInt();
		}while(n <= 0);
		
		for(int i = 0; i < n/2; i++)
			System.out.print("+-");
		/*
		 * 만약 카운터용 변수 i 값을 변경한다면?
		 * for문을 아래처럼 변경하면 해결됨. >> for문의 초기화 부분만 변경하고 루프 본문은 그대로 둠.
		 * 
		 * for(int i = 1; i < n/2; i++)
			System.out.print("+-");
		 */
		
		if(n%2 != 0)
			System.out.println("+");
		
	}
}

/* 보완된점
 * 	1. for문에서 +-를 함께 n/2회 출력
 *  2. n이 홀수일 때에만 +를 출력
 *  3. 반복할 때마다 if문의 판단을 받을 필요가 없음!(마지막 한 번 실행)
 */