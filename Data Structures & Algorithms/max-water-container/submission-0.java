class Solution {
    public int maxArea(int[] h) {
        int l=0,r=h.length-1;
        int max=-1;
        while(l<r){
            int water=(r-l)*Math.min(h[l],h[r]);
            max=Math.max(water,max);
            if(h[l]<=h[r]){
                l++;
            }else{
                r--;
            }
        }
        return max;
    }
}
