package ch01;

import java.util.Scanner;

// ���콺�� ����(1~n������ ��: (1+n)*5)
public class Ex01_8_7GaussSum {
	
	static int gaussSum(int n) {
		int sum = 0;
		sum = (1+n)*(n/2)+(n % 2 == 1 ? (n + 1) / 2 : 0);
							// n�� Ȧ���϶� ó��
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("1���� n������ ������ ���մϴ�.");
		System.out.println("n�� ���� �Է����ּ���.");
		int n = stdIn.nextInt();
		System.out.println("1���� "+n+"������ ���� "+gaussSum(n)+"�Դϴ�.");
	}
}
