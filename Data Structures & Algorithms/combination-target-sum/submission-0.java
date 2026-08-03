class Solution {

    ArrayList<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {

        backtracking(0,nums,target,new ArrayList<>());

        return list;


        
    }

    void backtracking(int index,int [] nums,int target,ArrayList<Integer> curr){


        if(target==0){
            list.add(new ArrayList<>(curr));
        }

        if(target<0) return;

        for(int i=index;i<nums.length;i++){

            curr.add(nums[i]);
            backtracking(i,nums,target-nums[i],curr);

            curr.remove(curr.size()-1);
        }
    }
}
