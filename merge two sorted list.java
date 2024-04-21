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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
           ListNode dummyhead = new ListNode();
          ListNode head = dummyhead;
        while(list1 != null && list2!=null){
            if(list1.val < list2.val){
                head.next = list1;
                list1 = list1.next;
                head  = head.next;
            }
            else{
                head.next = list2;
                list2 = list2.next;
                head  = head.next;
            }
        }
        while(list1 != null){
            head.next = list1;
            list1 = list1.next;
            head = head.next;
        }
        while(list2 != null){
            head.next = list2;
            list2 = list2.next;
            head = head.next;
        }
        return dummyhead.next;
    }
}
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1==null) return list2;
        else if(list2==null) return list1;
        ListNode res=new ListNode();
        ListNode ptr1=list1;
        ListNode ptr2=list2;

        if(ptr1.val>ptr2.val){
            res= ptr2;
            ptr2=ptr2.next;
        }else{
            res= ptr1;
            ptr1=ptr1.next;
        }
        ListNode resPtr=res;

        while(ptr1!=null && ptr2!=null){
            if(ptr1.val>ptr2.val){
                resPtr.next= ptr2;
                resPtr=resPtr.next;
                ptr2=ptr2.next;
            }else{
                resPtr.next= ptr1;
                resPtr=resPtr.next;
                ptr1=ptr1.next;
            }
        }

        if(ptr1==null) resPtr.next=ptr2;
        else resPtr.next= ptr1;
        return res;
    }
}


class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            // Check if ant of the lists are null
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        // Head of the result list
        ListNode head;
        // Pointer for the resultant list
        ListNode temp;
        // Choose head which is smaller of the two lists
        if (l1.val < l2.val) {
            temp = head = new ListNode(l1.val);
            l1 = l1.next;
        } else {
            temp = head = new ListNode(l2.val);
            l2 = l2.next;
        }
        // Loop until any of the list becomes null
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                temp.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                temp.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            temp = temp.next;
        }
        // Add all the nodes in l1, if remaining
        while (l1 != null) {
            temp.next = new ListNode(l1.val);
            l1 = l1.next;
            temp = temp.next;
        }
        // Add all the nodes in l2, if remaining
        while (l2 != null) {
            temp.next = new ListNode(l2.val);
            l2 = l2.next;
            temp = temp.next;
        }
        return head;
    
    }
}
