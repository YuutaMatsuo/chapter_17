package q02;

import java.io.IOException;

public class Main01 {
	public static void main(String[] args) throws IOException{
		// 問１
//		String s = null;
//		System.out.println(s.length());
		
		// 問2
//		try {
//			String s = null;
//			System.out.println(s.length());
//		} catch(NullPointerException e) {
//			System.out.println("NullPointerException例外をcatchしました");
//			System.out.println("---スタックトレース（ここから）---");
//			e.printStackTrace();
//			System.out.println("---スタックトレース（ここまで）---");
//		}
		
		// 問４
//		try {
//			String str = "三";
//			int num = Integer.parseInt(str);
//		} catch(NumberFormatException e) {
//			System.out.println("例外が発生しました");
//			e.printStackTrace();
//		}
		
		// 問５
		throw new IOException();
	}
}
