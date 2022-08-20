package ch01;

import java.util.Scanner;

// 대소 관계 구분 없이 a와 b사이 값들의 덧셈을 구함
public class Ex01_8_8SumOf {
	static int sumof(int a, int b) {
		int min;	// a, b 중 작은 값
		int max;	// a, b 중 큰 값
		
		if(a > b) {
			min = b;
			max = a;
		} else {
			min = a;
			max = b;
		}
		
		int sum = 0;
		for(int i = min; i <= max; i++) {
			sum += i;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("a와 b를 포함하여 두 사이에 있는 정수의 합을 구합니다.");
		System.out.println("a의 값:");
		int a = stdIn.nextInt();
		System.out.println("b의 값:");
		int b = stdIn.nextInt();
		
		System.out.println(a+"와 "+b+"사이의 정수의 총합은 "+sumof(a,b)+"입니다.");
		
	}
}
