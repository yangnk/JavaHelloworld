package io.io;

import java.io.*;

/**
 * Created by yangnk23900 on 2018/10/9.
 */
public class FileIOTest {
	public static void main(String[] args) throws IOException {
		File file = new File("/Users/yangnk/IdeaProjects/JavaHelloworld/src/main/java/io.io/data.txt");
		InputStreamReader inputStream = new InputStreamReader(new FileInputStream(file));
		int c;
		while ((c = inputStream.read()) != -1) {
			System.out.print((char) c);
		}
	}
}
