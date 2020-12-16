/**
 * leetcode 141 环形链表
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    //哈希表存储ListNode去重
    public boolean hasCycle(ListNode head) {
       Set<ListNode> set = new HashSet<>();
        while (head != null) {
           if (!set.add(head)) {
               return true;
           }
            head = head.next;
        }
        return false;
    }
}