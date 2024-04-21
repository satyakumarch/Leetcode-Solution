import java.util.ArrayList;
public class traversal {
class Node  
 { 
     int data; 
     Node left, right;  
     public Node(int d)  
     { 
         data = d; 
         left = right = null; 
     } 
}
    ArrayList<Integer> boundary(Node node){
        ArrayList<Integer>res = new ArrayList<Integer>(0);
        if(node != null){
            res.add(node.data);
        }
        printboundaryleft(node.left,res);
        printleaves(node.left,res);
        printleaves(node.right,res);
        printboundaryright(node.right,res);
        return res;
    }
    private void printleaves(Node node, ArrayList<Integer> res) {
        if(node!=null){
            printleaves(node.left, res);
            if(node.left == null && node.right == null){
                res.add(node.data);
            }
            printleaves(node.right, res);
        }
    }
    private void printboundaryright(Node node, ArrayList<Integer> res) {
        if(node!=null){
            if(node.right!=null){
                printboundaryright(node.right, res);
                res.add(node.data);
            }
            else if(node.left!=null){
                printboundaryright(node.left, res);
                res.add(node.data);
            }
        }
    }
    private void printboundaryleft(Node node, ArrayList<Integer> res) {
        if(node!= null){
            if(node.left!= null){
                res.add(node.data);
                printboundaryleft(node.left, res);
            }
            else if(node.right!=null){
                res.add(node.data);
                printboundaryleft(node.right, res);
            }
        }
    }
    
 }
