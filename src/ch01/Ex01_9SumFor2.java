package ch01;

import java.util.Scanner;

// ����� �Է¹޾� 1~n������ ���� ����
public class Ex01_9SumFor2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		
		do {
			System.out.println("n�� ��: ");
			n = stdIn.nextInt();
		}while(n <= 0);
		
		int sum = 0;
		for(int i = 0; i <= n; i++) {
			sum += i;
		}
		
		System.out.println("1���� "+n+"������ ���� "+sum+"�Դϴ�.");
	}
}
