package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-11-13 下午9:31
 **/
public class ListSample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

//        list.add("hangzhou");
//        list.add("beijing");
//        list.add("shanghai");

        linkedList.push("beijing");
        linkedList.push("shanghai");
        linkedList.push("guangzhou");
        linkedList.push("shenzhen");

        System.out.println(linkedList.pop());
        System.out.println(linkedList.pop());
        System.out.println(linkedList.pop());
        System.out.println(linkedList.pop());


    }
}
