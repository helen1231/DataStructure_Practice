package ch01;

import java.util.Scanner;

// �ݺ��������� ���� �Ǵ�(+,-��ȣ�� ������ ���)
public class Ex01_12Alternative1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("+�� -�� ������ n�� ����մϴ�.");

		do {
			System.out.println("n ��:");
			n = stdIn.nextInt();
		}while(n <= 0);
		
		for(int i = 0; i < n; i++)
			if(i % 2 == 0)
				System.out.print("+");	// ¦��
			else
				System.out.print("-");	// Ȧ��
		
		// Ȥ��! 
		
		System.out.println();
		for (int i = 1; i <= n; i++)
			if (i % 2 == 0)				// Ȧ��
				System.out.print("-");
			else						// ¦��
				System.out.print("+");
	}

}
/* ������
 *  1. �ݺ��� ������ if�� ����
 *  2. ������ �� �����ϰ� �����ϱ� �����
 *  	e.g. i���� 0�� �ƴ϶� 1���� �����Ѵٸ�? - for ����ü ���� �ʿ�
 */
