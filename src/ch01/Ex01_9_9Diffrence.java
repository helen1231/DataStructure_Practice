package ch01;

import java.util.Scanner;

// a, b���� �Է¹ް� b-a �� ���ϱ�, b�� ���� a�� ���ϸ� �ٽ� �Է¹ޱ�
public class Ex01_9_9Diffrence {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("a��: ");
		int a = stdIn.nextInt();
		
		int b; 
		while(true) {
			System.out.println("b��: ");
			b = stdIn.nextInt();
			if(b > a) break;
			System.out.println("a���� ū ���� �Է����ּ���.");
		}
		
		System.out.println("b-a�� "+(b-a)+"�Դϴ�.");
	}
}
