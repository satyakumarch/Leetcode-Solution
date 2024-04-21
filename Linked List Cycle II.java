https://leetcode.com/problems/linked-list-cycle-ii/
/**
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
What question is saying we have Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
Inorder to solve this question we will gonna use Floyd Cycle Algorithm which states that :
Traverse linked list using two pointers.
Move one pointer(slow_p) by one and another pointer(fast_p) by two.
If these pointers meet at the same node then there is a loop. If pointers do not meet then linked list doesn’t have a loop.
Now, let's understand how we will solve this problem using above algorithm:
First take one example : head = [3,2,0,-4], pos = 1 and look at this visually,
We will use two pointers fast & slow. The fast one move at the speed of 2X & the slow one move at the speed of 1X intially.
So, we will start traversing both the pointers one by one, hence there is a cycle so fast & slow pointer will gauranteed meet at a point.
image
As we see in the diagram they have meet at -4 node. Which shows that there is a cycle. But, if there is no loop then, fast will move to null OR fast.next will move to null early before slow on the middle node.
But our focus is on where the cycle has started. So, for that once they meet [slow == fast] then, we will reset the slow back to head & start moving slow with 1X speed and fast will carry on from where it was previously but with 1X speed
image
Once slow & fast collab we will return either slow OR fast is same thing. As, they will return tail connects to node index 1


public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
// But our focus is on where the cycle has started. So, for that once they meet [slow == fast] then, we will reset the slow back to head & start moving slow with 1X speed and fast will carry on from where it was previously but with 1X speed
// Once slow & fast collab we will return either slow OR fast is same thing. As, they will return tail connects to node index 1
                slow = head;
                while(slow!=fast){
                    slow=slow.next;
                    fast= fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
