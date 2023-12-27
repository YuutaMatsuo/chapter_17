package p01;

import java.util.Scanner;

public class Main02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		FileWriter fw = new FileWriter("data.txt");

		try {
			System.out.println("入力▼");
			String word = sc.nextLine();
//			String word = new Scanner(System.in).nextLine();
			int a = Integer.parseInt(word);
		} catch (NumberFormatException e) {
			System.out.println("入力値を数値に変換できませんでした");
			// 例外的状況の解説文を取得する
			System.out.println(e.getMessage());
			// スタックトレースの内容を画面に出力する
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("何らかのエラーが発生しました");
		} finally {
			System.out.println("プログラムを終了します");
			sc.close();
		}
	}
	
	public static void exception() {
		String word = new Scanner(System.in).nextLine();
		int a = Integer.parseInt(word);
	}
}
