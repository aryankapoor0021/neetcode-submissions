class Solution {
    public int removeElement(int[] nums, int val) {
        int j=0;
        int []ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val) {
                ans[j]=nums[i];
                j++;
            }
        }

        for(int k=0;k<j;k++){
            nums[k]=ans[k];
        }

        return j;
    }
}