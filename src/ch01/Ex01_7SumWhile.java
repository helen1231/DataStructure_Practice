package ch01;

import java.util.Scanner;

public class Ex01_7SumWhile {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.println("n��: ");
		int n = stdIn.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while(i <= n) {
			sum += i;
			i++;
		}
		System.out.println("1���� "+n+"������ ���� "+sum+"�Դϴ�.");
		System.out.println("i�� ���� "+i+"�Դϴ�.");
	}
}
