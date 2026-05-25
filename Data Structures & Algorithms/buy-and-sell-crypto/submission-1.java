class Solution {
    public int maxProfit(int[] p) {
        
        int l=0;
        int currMax=0;

        for(int r=1;r<p.length;r++){
            if(p[l]>p[r]){
                l=r;
            }
            currMax=Math.max(p[r]-p[l],currMax);
        }

        return currMax;
    }
}
