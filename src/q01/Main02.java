package q01;

public class Main02 {
	public static void main(String[] args) {
		// 問３
		try {
			int x = Integer.parseInt(args[0]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("第一引数がありません");
		} catch (NumberFormatException e) {
			System.out.println("第一引数には数値を指定してください");
		}
	}
}
