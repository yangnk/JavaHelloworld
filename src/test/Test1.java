package test;

import java.math.BigDecimal;

/**
 * Created by yangnk23900 on 2018/11/26.
 */
public class Test1 {
	public static void main(String[] args) {
//		float v = 1.1f;
//		float v1 = 2.2f;
//		System.out.println(v + v1);
		BigDecimal bigDecimal = new BigDecimal("1.1");
		BigDecimal bigDecimal1 = new BigDecimal("2.2");
		System.out.println(bigDecimal.add(bigDecimal1));
		System.out.println("============");
		double v = 1.1;
		double v1 = 2.2;
		System.out.println(v + v1);
	}
}
