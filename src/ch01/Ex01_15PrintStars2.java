package ch01;

import java.util.Scanner;

// *�� n�� ���, w������ �ٹٲ�(2, if�� �ߺ� ���� ����)
public class Ex01_15PrintStars2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n, w;
		
		System.out.println("*�� n�� ���, w������ �ٹٲ�");
		
		do {
			System.out.println("n��: ");
			n = stdIn.nextInt();
		}while(n <= 0);

		do {
			System.out.println("w��: ");
			w = stdIn.nextInt();
		}while(w <= 0);
		
		for(int i = 0; i < n/w; i++) {
			System.out.println("*".repeat(w));
		}
		
		int rest = n % w;
		if(rest != 0)
			System.out.println("*".repeat(rest));
	}
}
