package ch01;

import java.util.Scanner;

// a, b정수 입력받고 b-a 값 구하기, b의 값이 a값 이하면 다시 입력받기
public class Ex01_9_9Diffrence {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("a값: ");
		int a = stdIn.nextInt();
		
		int b; 
		while(true) {
			System.out.println("b값: ");
			b = stdIn.nextInt();
			if(b > a) break;
			System.out.println("a보다 큰 값을 입력해주세요.");
		}
		
		System.out.println("b-a는 "+(b-a)+"입니다.");
	}
}
