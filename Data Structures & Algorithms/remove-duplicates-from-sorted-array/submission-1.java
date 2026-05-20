class Solution {
    public int removeDuplicates(int[] a) {
        
        int i=1,j=0;

        while(i<a.length){
            if(a[j]!=a[i]){
                j++;
                a[j]=a[i];
            }
            i++;
        }
        return j+1;
    }
}