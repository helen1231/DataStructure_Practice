package ch01;

// 이중 루프를 이용한 구구단 곱셈표 출력
public class Ex01_16Multi99Table {
	public static void main(String[] args) {
		System.out.println("=========구구단 곱셈표=========");
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%3d", i*j);
			}
			System.out.println();
		}
	}
}
