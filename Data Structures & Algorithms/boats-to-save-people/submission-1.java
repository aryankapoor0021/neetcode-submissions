class Solution {
    public int numRescueBoats(int[] a, int limit) {

        int ans=0;
        int l=0,r=a.length-1;
        Arrays.sort(a);

        while(l<=r){
            int rem=limit-a[r];
            r--;
            ans++;
            if(l<=r && rem>=a[l]) l++;
        }
        return ans;
    }
}