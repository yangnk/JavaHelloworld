package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by yangnk23900 on 2018/10/9.
 */
public class Test {
	public static void main(String[] args) throws IOException {
		File file = new File("/Users/yangnk/IdeaProjects/JavaHelloworld/src/io/data.txt");
		InputStream inputStream = new FileInputStream(file);
		byte[] bytes = new byte[1024];
		inputStream.read(bytes);
		inputStream.close();
		System.out.println(bytes);
	}
}
