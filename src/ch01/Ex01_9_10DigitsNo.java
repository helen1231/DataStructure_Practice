package ch01;

import java.util.Scanner;

// ���� ������ �Է��ϰ� �ڸ����� ����ϱ�
public class Ex01_9_10DigitsNo {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("���� ������ �ڸ����� ���մϴ�!!!");
		
		int n;
		do {
			System.out.println("�ڸ����� Ȯ���ϰ����ϴ� ���� ������ �Է����ּ���!");
			n = stdIn.nextInt();
		}while(n <= 0);
		
		int no = 0; // �ڸ���
		while(n > 0) {
			n /= 10;							// 10���� ���� ���� �ִ���!
			System.out.println("n��:"+n);		// n �� Ȯ��
			no++;								// 10���� ���� ����� ������ �ڸ����� 1���� �÷���								
			System.out.println("no������:"+no);
		}
		// n�� 0�� �Ǿ 10���� �����Ⱑ �Ұ����� ������ while���� �����.
		// 10���� ���� Ƚ�� >> 10������ ����ϴ� ���� ������ n�� �ڸ����� ��! 
		
		System.out.println("�� ���� " + no + "�ڸ��Դϴ�.");
	}

}
