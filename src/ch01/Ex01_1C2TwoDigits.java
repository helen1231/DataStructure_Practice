package ch01;

import java.util.Scanner;

// 2자리 양수 입력
public class Ex01_1C2TwoDigits {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int no;
		
		System.out.println("2자리 정수를 입력하세요!");
		
		do {
			System.out.print("no 값:");
			no = stdIn.nextInt();
		}while(no < 10 || no > 99);
		
		System.out.println("변수 no값은 "+no+"이 되었습니다.");
	}
}