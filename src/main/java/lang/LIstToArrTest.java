package lang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LIstToArrTest {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        //List<Integer> --> int[]
        int[] ints = list.stream().mapToInt(Integer::intValue).toArray();
        //List<Integer> --> Integer[]
        Integer[] integersArr = list.toArray(new Integer[list.size()]);

        //int[]--> Integer[]
        Integer[] integersArr1 = Arrays.stream(ints).boxed().toArray(Integer[]::new);
        //Integer[] --> int[]
         int[] ints1 = Arrays.stream(integersArr).mapToInt(Integer::intValue).toArray();

        System.out.println("ints = " + Arrays.toString(ints));
        System.out.println("integersArr = " + Arrays.toString(integersArr));
        System.out.println("integersArr1 = " + Arrays.toString(integersArr1));
        System.out.println("ints1 = " + Arrays.toString(ints1));

    }
}
