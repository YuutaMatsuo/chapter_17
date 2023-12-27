package q01;

public class Main03 {
	public static void main(String[] args) {
		// 問４
		try {
		int x = Integer.parseInt(args[0]);
		} catch(Exception e) {
			System.out.println("例外が発生しました");
			e.printStackTrace();
		}
		
	}
}
