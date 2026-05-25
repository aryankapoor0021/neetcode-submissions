class Solution {
    public boolean containsNearbyDuplicate(int[] a, int k) {
        
        HashSet<Integer> window=new HashSet<>();

        int l=0;
        for(int r=0;r<a.length;r++){
            if(r-l>k){
                window.remove(a[l]);
                l++;
            }

            if(window.contains(a[r])){
                return true;
            }
            window.add(a[r]);
        }
        return false;

    }
}