package ch01;

import java.util.Scanner;

// �ݺ��������� ���� �Ǵ�(+,-��ȣ�� ������ ���)2 - ���Ǻ���
public class Ex01_13Alternative2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("+�� -�� ������ n�� ����մϴ�.");

		do {
			System.out.println("n ��:");
			n = stdIn.nextInt();
		}while(n <= 0);
		
		for(int i = 0; i < n/2; i++)
			System.out.print("+-");
		/*
		 * ���� ī���Ϳ� ���� i ���� �����Ѵٸ�?
		 * for���� �Ʒ�ó�� �����ϸ� �ذ��. >> for���� �ʱ�ȭ �κи� �����ϰ� ���� ������ �״�� ��.
		 * 
		 * for(int i = 1; i < n/2; i++)
			System.out.print("+-");
		 */
		
		if(n%2 != 0)
			System.out.println("+");
		
	}
}

/* ���ϵ���
 * 	1. for������ +-�� �Բ� n/2ȸ ���
 *  2. n�� Ȧ���� ������ +�� ���
 *  3. �ݺ��� ������ if���� �Ǵ��� ���� �ʿ䰡 ����!(������ �� �� ����)
 */