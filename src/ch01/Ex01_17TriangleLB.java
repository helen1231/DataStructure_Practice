package ch01;

import java.util.Scanner;

// ���� ���� ���� - �Ʒ��� ������ �̵ �ﰢ�� ���
public class Ex01_17TriangleLB {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("���� �Ʒ��� ������ �̵�ﰢ�� ���");
		
		do{
			System.out.print("�� �� �ﰢ���Դϱ�??: ");
			n = stdIn.nextInt();
		}while(n <= 0);
	
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}