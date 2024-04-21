// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }


class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;
        
        ListNode oddHead = null, oddTail = null;
        ListNode evenHead = null, evenTail = null;
        ListNode curr = head;
        int i = 1;
        while(curr!=null){
			// generate the odd indices list
            if(i%2==1){
                if(oddHead==null){
                    oddHead = curr;
                    oddTail = curr;
                }
                else{
                    oddTail.next = curr;
                    oddTail = oddTail.next;
                }
            }
			// generate the even indices list
            else{
                if(evenHead==null){
                    evenHead = curr;
                    evenTail = curr;
                }
                else{
                    evenTail.next = curr;
                    evenTail = evenTail.next;
                }
            }
            curr = curr.next;
            i++;
        }
        
        evenTail.next = null;     // there should not be any node after even tail
        oddTail.next  = evenHead;   // join even list after odd
        return oddHead;
    
    }
}

class Solution {
    public ListNode oddEvenList(ListNode head) {  
        LinkedList odd = new LinkedList();
          LinkedList even = new LinkedList();
        while(this.size>0){
            int val = this.getFirst();
            this.removeFirst();
            if(val%2==0){
                even.addLast(val);
            }
            else{
                odd.addLast(val);
            }
        }
        if(odd.size>0 && even.size>0){
            this.head = odd.head;
            this.tail = odd.tail;
            this.size = odd.size;
        }
        if(odd.size>0){
            this.head = even.head;
            this.tail = even.tail;
            this.size = even.size;
    }
}
}
