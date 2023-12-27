package p01;

import java.io.FileWriter;

public class Main04 {
	public static void main(String[] args) {
		try (FileWriter fw = new FileWriter("data.txt");) {
			fw.write("HELLO");
		} catch (Exception e) {
			System.out.println("例外が発生");
		}
	}
}
