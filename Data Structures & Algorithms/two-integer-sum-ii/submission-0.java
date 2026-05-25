class Solution {
    public int[] twoSum(int[] a, int target) {
        
        int []ans=new int[2];
        int l=0,r=a.length-1;
        while(l<r){
            System.out.println("a[l] ,"+a[l]+" a[r] "+a[r]);
            if(a[l]+a[r]==target){
                ans[0]=l+1;
                ans[1]=r+1;
                return ans;
            }else if(a[l]+a[r]>target){
                r--;
            }else{
                l++;
            }
        }
        return ans;
    }
}
