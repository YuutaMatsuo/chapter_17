package p01;

import java.io.FileWriter;
import java.io.IOException;

public class Main03 {
	public static void main(String[] args) {
		FileWriter fw = null;

		try {
			fw = new FileWriter("data.txt");
//			FileWriter fw = new FileWriter("data.txt");
			fw.write("hello");
		} catch (Exception e) {
			System.out.println("ファイル操作に問題が生じました");
		} finally {
			if (fw != null) { // feがnullかチェックし、nullじゃ無かったらcloseする
				try {
					fw.close();
				} catch (IOException e) {
					; // 空文 なにも書く処理がないときに暗黙の了解として;を書く
				}
			}
		}
	}
}
