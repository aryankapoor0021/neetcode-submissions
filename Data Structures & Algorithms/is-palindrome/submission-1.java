class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        char[] ar = s.toCharArray();
        for(char ch:ar){
            if(isAlphanumeric(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }
        System.out.println(sb.toString());
        return isPalindromeHelper(sb.toString(),0,sb.length()-1);
    }

    public boolean isPalindromeHelper(String s,int l,int r){
        if(l<r){
            return ((s.charAt(l)==s.charAt(r)) && isPalindromeHelper(s,l+1,r-1));
        }
        return true;
    }

    private boolean isAlphanumeric(char c){
        if( (c>='A' && c<='Z') || (c>='a' && c<='z') || (c>='0'&& c<='9')){
          return true;
        }
        return false;
    }
}
