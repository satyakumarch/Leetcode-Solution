https://leetcode.com/problems/middle-of-the-linked-list
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
      
      length approach
        
        
        int len  =0;
        ListNode current = head;
        while(current!=null){
            len++;
            current = current.next;
        }
        current = head;
        int mid = len /2;
        for(int i =0;i<mid;i++){
            current = current.next;
        }
        return current;
    }
}
  
Turtle Rabit appraoach
        ListNode fast = head;
        ListNode slow =head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
