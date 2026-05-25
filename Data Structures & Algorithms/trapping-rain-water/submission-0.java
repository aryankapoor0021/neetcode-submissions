class Solution {
    public int trap(int[] a) {
        


        int []leftmax=new int[a.length];
        int []rightmax=new int[a.length];
        int ans=0;

        leftmax[0]=a[0];
        for(int i=1;i<a.length;i++){
            leftmax[i]=Math.max(leftmax[i-1],a[i]);
        }

        rightmax[a.length-1]=a[a.length-1];
        for(int i=a.length-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],a[i]);
        }

        for(int i=0;i<a.length;i++){
            ans+=Math.min(leftmax[i],rightmax[i])-a[i];
        }

        return ans;
        


    }
}
