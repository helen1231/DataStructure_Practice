package ch01;

import java.util.Scanner;

// 1~n������ �� �� �� ���� ���ϴ� ������ ���
public class Ex01_10SumVerbose1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("n�� �Է�: ");
			n = stdIn.nextInt();
		}while(n <= 0);

		int sum = 0;
		for(int i = 1; i <= n; i++) {
			if(i < n) 
				System.out.print(i+" + ");
			else
				System.out.println(i+" = ");
			sum += i;
		}
		System.out.println("1���� "+n+"������ ���� "+sum+"�Դϴ�.");
	}
}
