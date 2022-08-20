package ch01;

import java.util.Scanner;

// 양의 정수를 입력하고 자릿수를 출력하기
public class Ex01_9_10DigitsNo {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("양의 정수의 자릿수를 구합니다!!!");
		
		int n;
		do {
			System.out.println("자릿수를 확인하고자하는 양의 정수를 입력해주세요!");
			n = stdIn.nextInt();
		}while(n <= 0);
		
		int no = 0; // 자릿수
		while(n > 0) {
			n /= 10;							// 10으로 나눈 값이 있는지!
			System.out.println("n값:"+n);		// n 값 확인
			no++;								// 10으로 나눈 결과가 있으면 자릿수를 1개씩 올려줌								
			System.out.println("no덧셈후:"+no);
		}
		// n이 0이 되어서 10으로 나누기가 불가능한 시점에 while문이 종료됨.
		// 10으로 나눈 횟수 >> 10진법을 사용하는 양의 정수인 n의 자릿수가 됨! 
		
		System.out.println("그 수는 " + no + "자리입니다.");
	}

}
