package ch01;

public class Ex01_2Method {
	// 3���� �Ű����� �߿��� �ִ� ���ϱ�
	static int max3(int a, int b, int c) {
		int max = a;
		if(b > max) max = b;
		if(c > max)	max = c;
		return max;	
	}
	
	// 4���� �Ű����� �߿��� �ִ� ���ϱ�
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if(b > max)	max = b;
		if(c > max)	max = c;
		if(d > max)	max = d;
		return max;
	}

	// 3���� �Ű����� �߿��� �ּڰ� ���ϱ�
	static int min3(int a, int b, int c) {
		int min = a;
		if(b < min) min = b;
		if(c < min) min = c;
		return min;
	}
	
	// 4���� �Ű����� �߿��� �ּڰ� ���ϱ�
	static int min4(int a, int b, int c, int d) {
		int min = a;
		if(b < min) min = b;
		if(c < min) min = c;
		if(d < min) min = d;
		return min;
	}
	
	// �� �޼��带 Ȱ���Ͽ� �ִ�/�ּ� �� ���Ͽ� ���
	public static void main(String[] args) {
		System.out.println("max3(3,2,1) = " + max3(3,2,1));
		System.out.println("max4(45,88,77,89) = " + max4(45,88,77,89));
		System.out.println("min3(88,488,47) = " + min3(88,488,47));
		System.out.println("min4(88,75,910,89) = "+ min4(88,75,910,89));
	}
}