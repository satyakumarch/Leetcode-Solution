import java.util.Stack;

public class Stock_span {
    public static void main(String[] args) {
        int arr[] = {91,11,13,15,38,42,37};
        span_calc(arr);
    }
    public static void span_calc(int []arr){
        int []span = new int[arr.length];

        Stack<Integer>st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while(!st.isEmpty() && arr[i] > arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                span[i] = i +1;
            }
            else{
                span[i] = i -  st.peek();
            }
            st.push(i);
        }
        for (int i = 0; i < span.length; i++) {
            System.out.println(span[i]);
        }
    }
}
