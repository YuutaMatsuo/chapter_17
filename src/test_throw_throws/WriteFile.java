package test_throw_throws;

import java.io.IOException;

public class WriteFile {
	public void oppenFile() {
		System.out.println("ファイルを開きます");
	}
	
	// writeFile()を呼び出す場合、IOExceptionを派生させる可能性があるから、
	// 呼び出し元で必ずtry-catchが必要だよ！という宣言（throws）をメソッド定義時にしておく
	public void writeFile() throws IOException {
		// 例外インスタンスを意図的に生成し「投げる」ことにより
		// 意図的にIOExceptionを発生させる
		throw new IOException();
	}
	// ※必ずしもhrowsとthrowをペアで書かなければならない、というわけではありません
	
	public void closeFile() {
		System.out.println("ファイルを保存して閉じます");
	}
}
