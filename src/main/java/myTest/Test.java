package myTest;

import java.io.*;
import java.nio.Buffer;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-14 上午11:27
 **/
public class Test {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        String s = reader.readLine();
        System.out.println(s);
    }
}
