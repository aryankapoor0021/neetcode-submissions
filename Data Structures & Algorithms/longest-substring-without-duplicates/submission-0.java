class Solution {
    public int lengthOfLongestSubstring(String s) {

        int len=0;
        int l=0,r=0;

        HashSet<Character> window=new HashSet<>();
        while(r<s.length()){

            while (window.contains(s.charAt(r))) {
                window.remove(s.charAt(l));
                l++;
            }
            window.add(s.charAt(r));
            len=Math.max(len,r-l+1);
            r++;
        }
        
        return len;

    }
}
