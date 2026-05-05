class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<Integer>();
        for(int val:nums) set.add(val);
        return (nums.length!=set.size());
    }
}