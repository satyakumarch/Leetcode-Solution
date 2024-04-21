class Solution {
      public void helper(int index,int[] candidates, int target,List<List<Integer>>list,List<Integer>ds){
         if(index == candidates.length){
        if(target == 0){
            list.add(new ArrayList<>(ds));
        }
            return;
    }
          if(candidates[index] <= target){
              ds.add(candidates[index]);
              helper(index,candidates,target-candidates[index],list,ds);
              ds.remove(ds.size()-1);
          }
          helper(index+1,candidates,target,list,ds);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
          List<List<Integer>>list = new ArrayList<>();
         helper(0,candidates,target,list,new ArrayList<>());
         return list;
    }
}
