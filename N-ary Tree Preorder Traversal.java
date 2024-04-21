https://leetcode.com/problems/n-ary-tree-preorder-traversal
class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        return preorders(root,list);
    }
    public List<Integer> preorders(Node root,List<Integer> list){
        if(root == null){
            return list;
        }
        list.add(root.val);
        for(int i =0;i<root.children.size();i++){
            list = preorders(root.children.get(i),list);
        }
        return list;
    }
}
