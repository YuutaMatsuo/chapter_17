package test_throw_throws;

import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		WriteFile wf = new WriteFile();
//		wf.oppenFile();
//		wf.writeFile(); // 呼び出し元で例外処理をしなければいけないメソッドを呼んでいる。
//		wf.closeFile();
		
		try {
			wf.oppenFile();
			wf.writeFile();
		} catch(IOException e) {
			System.out.println("IOExceptionが発生！");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("何らかのエラーが発生！");
			e.printStackTrace();
		} finally {
			wf.closeFile();
		}
	}
}
