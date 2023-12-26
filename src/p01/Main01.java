package p01;

import java.util.Scanner;

public class Main01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[2];

		for (int i = 0; i < numbers.length; i++) {

			// ArrayIndexOutOfBoundsExceptionが発生する可能性！
			// for文の条件式を間違えると発生
//		for(int i = 0; i <= numbers.length; i++) {

			System.out.println(i + 1 + "つ目の数を入力してください");
			
			// InputMismatchExceptionが発生する可能性！
			// 数値ではなく文字列を入力すると発生
			numbers[i] = sc.nextInt();
		}

		System.out.println("計算開始");
		
		// ArithmeticExceptionが発生する可能背！
		// 0で割り算をすると発生
		System.out.println("a / b =" + numbers[0] / numbers[1] + "あまり" + numbers[0] % numbers[1]);
	}
}
