package ch01;

import java.util.Scanner;

// 가우스의 덧셈(1~n까지의 합: (1+n)*5)
public class Ex01_8_7GaussSum {
	
	static int gaussSum(int n) {
		int sum = 0;
		sum = (1+n)*(n/2)+(n % 2 == 1 ? (n + 1) / 2 : 0);
							// n이 홀수일때 처리
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("1부터 n까지의 총합을 구합니다.");
		System.out.println("n의 값을 입력해주세요.");
		int n = stdIn.nextInt();
		System.out.println("1부터 "+n+"까지의 합은 "+gaussSum(n)+"입니다.");
	}
}
