package ch01;

import java.util.Scanner;

// 2�ڸ� ��� �Է�
public class Ex01_1C2TwoDigits {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int no;
		
		System.out.println("2�ڸ� ������ �Է��ϼ���!");
		
		do {
			System.out.print("no ��:");
			no = stdIn.nextInt();
		}while(no < 10 || no > 99);
		
		System.out.println("���� no���� "+no+"�� �Ǿ����ϴ�.");
	}
}