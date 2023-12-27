package p01;

public class Main06 {
	public static void main(String[] args) {
		// catchブロックは省略できる(条件あり)
		// （条件とは...?） finallyブロックが指定されているtry文
		try {
			Object obj = "catchブロックの省略テスト";
			int test = (int)obj;
		} finally {
			System.out.println("finallyブロックを通過します");
		}
		
		System.out.println("すべてのブロックを通過しました");
	}
}
