package test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 入力された値を受け取る変数
		String result;

		// 入力を受け付ける（１～２以外の値が入力されると例外が発生する）
		while (true) {
			try {
				System.out.println("１～２の数字を入力してください");
				result = input();
				break;
			} catch (InputIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
//				e.printStackTrace();
			}
		}

		System.out.println("入力された値：" + result);
	}

	// 入力を受け取るメソッド
	// １～２の値がが入力されると文字列として返す
	// それ以外の入力は例外をスローする
	public static String input() throws InputIndexOutOfBoundsException {
		String str = new Scanner(System.in).nextLine();
		switch (str) {
		case "1":
			return str;
		case "１":
			return str;
		case "2":
			return str;
		case "２":
			return str;
		default:
			throw new InputIndexOutOfBoundsException();
		}
	}
}
