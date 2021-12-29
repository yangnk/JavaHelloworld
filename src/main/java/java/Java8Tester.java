package java;

import java.util.ArrayList;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2021-12-27 16:15
 **/
public class Java8Tester {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList();
        Java8Tester tester = new Java8Tester();
        MathOperation addition = (int a, int b) -> a + b;
        System.out.println(tester.operate(1, 2, addition));
    }
    interface MathOperation{
        int operation(int a, int b);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

}
