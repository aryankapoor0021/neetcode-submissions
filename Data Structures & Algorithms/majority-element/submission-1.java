class Solution {
    public int majorityElement(int[] nums) {

        int ct=0,ans=0;
        for(int num:nums){
            if(ct==0) ans=num;
            ct+=num==ans?1:-1;
        }
        return ans;
    }
}