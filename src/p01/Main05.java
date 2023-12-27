package p01;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main05 {
	public static void main(String[] args) {
		try {
			methodA(); // メソッドAを呼び出す
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("例外が発生");
		}
	}

	public static void methodA() {
		try {
			methodB(); // メソッドBを呼び出す
		} catch (IOException e) {
			System.out.println("例外が発生");
		}
	}

	public static void methodB() throws IOException, FileNotFoundException, ArrayIndexOutOfBoundsException {
		// 例外が発生する可能性を含む処理
		int[] array = new int[1];
		array[1] = 0; // ArrayIndexOutOfBundsExceptionが発生！
	}
}
