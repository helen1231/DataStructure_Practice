package ch01;

import java.util.Scanner;

// 1~n������ ���� ����(n�� ���� ����, ���� ���뵵 ǥ��, �ݺ� ���̱�)
public class Ex01_11SumVerbose2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�!");
		int n;
		
		do {
			System.out.println("n ��: ");
			n = stdIn.nextInt();
		}while(n <= 0);
		
		int sum = 0;
		for(int i = 1; i < n; i++) {	// Ex01_10SumVerbose1 ��� for�� �ݺ��� 1�� ����
			System.out.print(i+" + ");
			sum += i;
		}
		
/*		System.out.println(n+" = ");
		sum += n;
		System.out.println(sum);
*/
		
		// /*~*/�� ������ 
		System.out.println(n+" = "+(sum+=n));
	}
}
