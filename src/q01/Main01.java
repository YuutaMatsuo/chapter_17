package q01;

public class Main01 {
	public static void main(String[] args) {
		// 問２
		try {
		System.out.println(args[0]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("第一引数がありません");
		} finally {
			System.out.println("プログラムを終了します");
		}
	}
}
