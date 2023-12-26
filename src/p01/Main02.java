package p01;

import java.util.Scanner;

public class Main02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		FileWriter fw = new FileWriter("data.txt");

		try {
			String word = sc.nextLine();
//			String word = new Scanner(System.in).nextLine();
			int a = Integer.parseInt(word);
		} catch (NumberFormatException e) {
			System.out.println("入力値を数値に変換できませんでした");
		} finally {
			System.out.println("プログラムを終了します");
			sc.close();
		}
	}
}
