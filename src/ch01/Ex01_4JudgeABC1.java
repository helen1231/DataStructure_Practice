package ch01;

import java.util.Scanner;

public class Ex01_4JudgeABC1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���.");
		int n = stdIn.nextInt();

		if(n == 1)
			System.out.println("A");
		else if(n == 2)
			System.out.println("B");
		else
			System.out.println("C");
	}
}
