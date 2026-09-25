class Solution {
    public int search(int[] a, int target) {
        
        int l=0,r=a.length-1;
        int mid=(l+r)/2;

        while(l<=r){
            mid=(l+r)/2;
            if(a[mid]==target){
                return mid;
            }
            else if(target>a[mid]){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return -1;
    }
}
