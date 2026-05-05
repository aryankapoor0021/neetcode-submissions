class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        int []ans=new int[2];

        for(int i=0;i<nums.length;i++){
            int dif=target-nums[i];  
            if(map.containsKey(dif)){ 
                ans[0]=map.get(dif); 
                ans[1]=i;
                return ans;
            }
            map.put(nums[i],i); 
        }

        return ans;
    }
}





