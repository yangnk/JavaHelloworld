package oj;
/**
 * @Description:
 * @Author: yangningkai
 * @CreateDate: 2019/3/25 9:16
 * @Version:
 */


 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }

public class Question_merge_two_sorted_lists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newListNode = new ListNode(0);
        ListNode cur = newListNode;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                cur = cur.next;//?
                l1 = l1.next;
            }else {
                cur.next = l2;
                cur = cur.next;
                l2 = l2.next;
            }
        }
        if (l1 == null) {
            cur.next = l2;
        }else {
            cur.next = l1;
        }
        return newListNode.next;
    }
}
