https://leetcode.com/problems/remove-duplicate-letters/
class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26];
        for (int i = 0; i < s.length(); i++){
            lastIndex[s.charAt(i) - 'a'] = i; // track the lastIndex of character presence
        }
        
        boolean[] seen = new boolean[26]; // keep track seen
        Stack<Integer> st = new Stack();
        
        for (int i = 0; i < s.length(); i++) {
            int curr = s.charAt(i) - 'a';
            if (seen[curr]) continue; // if seen continue as we need to pick one char only
            while (!st.isEmpty() && st.peek() > curr && i < lastIndex[st.peek()]){
                seen[st.pop()] = false; // pop out and mark unseen
            }
            st.push(curr); // add into stack
            seen[curr] = true; // mark seen
        }

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty())
            sb.append((char) (st.pop() + 'a'));
        return sb.reverse().toString();
    }
}



do, use the stack to keep track of selected character's. We try to put the character's only once & maintain the lexicographicall smallest one. So, how we do that :-

If the stack is empty, we'll put the current character into our stack
We'll also keep here boolean array which will mark, whether we have seen this character or not. So, that if we are getting again the same character and we have already seen that. We'll ignore that character.
So, the length of boolean array will be 26
Let's Undertsand it's working

First we put character c into our stack and mark it as true

Then we come to next character i.e. b we check is b < c to maintain lexicographically order. Yes b is samller then c we'll remove it from the stack.

But before removing we have to check that, is c more present in our string. So, how will we quickly check that for that we'll keep one more Array which will keep track of last index of all the character's present in our string

So, we see that c exists on 7th index.

We'll remove c from the stack & don't forgot to mark c in boolean array from true to false

Now add b into our stack. ANd mark b in boolean array as true

Now next character is a which is smaller then b & do the same process of checking if it exists somewhere in array & if so, remove it from stack update boolean to false. And put a into the stack. And in boolean array mark it as true.

Let's add c in the stack mark it as true & c > a so carry on....

Let's add d in the stack mark it as true & d > c so carry on....

Now we encounter c which is already visited so, carry on....

Let's add b in the stack mark it as true & b < d so carry on....

