package ch01;

import java.util.Scanner;

// ��� ���� ���� ���� a�� b���� ������ ������ ����
public class Ex01_8_8SumOf {
	static int sumof(int a, int b) {
		int min;	// a, b �� ���� ��
		int max;	// a, b �� ū ��
		
		if(a > b) {
			min = b;
			max = a;
		} else {
			min = a;
			max = b;
		}
		
		int sum = 0;
		for(int i = min; i <= max; i++) {
			sum += i;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("a�� b�� �����Ͽ� �� ���̿� �ִ� ������ ���� ���մϴ�.");
		System.out.println("a�� ��:");
		int a = stdIn.nextInt();
		System.out.println("b�� ��:");
		int b = stdIn.nextInt();
		
		System.out.println(a+"�� "+b+"������ ������ ������ "+sumof(a,b)+"�Դϴ�.");
		
	}
}
