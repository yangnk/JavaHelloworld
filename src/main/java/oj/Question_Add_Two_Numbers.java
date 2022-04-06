package oj;

import java.math.BigInteger;

/**
 * @Description:
 * @Author: yangningkai
 * @CreateDate: 2019/4/15 9:11
 * @Version:
 */
public class Question_Add_Two_Numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger bigInteger1 = getBigInteger(l1);
        BigInteger bigInteger2 = getBigInteger(l2);
        BigInteger sum = bigInteger1.add(bigInteger2);
        return transferList(sum);
    }

    /**
     * biginteger转lisy
     * @param sum
     */
    static ListNode transferList(BigInteger sum) {
        String str = sum.toString();
        ListNode tmp = null;
        ListNode firstNode = null;
        for (int i = str.length() - 1; i >= 0; i--) {
            int a = str.charAt(i) - '0';
            if (firstNode == null) {
                firstNode = new ListNode(a);
                tmp = firstNode;
            }else {
                ListNode listNode = new ListNode(a);
                tmp.next = listNode;
                tmp = tmp.next;
            }
        }
        return firstNode;
    }

    /**
     * list转biginteger
     * @param listNode
     * @return
     */
    static BigInteger getBigInteger(ListNode listNode) {
        StringBuffer stringBuffer = new StringBuffer();
        while (listNode.next != null) {
            stringBuffer.append(listNode.val);
            listNode = listNode.next;
        }
        return new BigInteger(stringBuffer.reverse().toString());
    }
}


