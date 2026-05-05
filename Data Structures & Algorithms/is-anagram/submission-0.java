class Solution {
    public boolean isAnagram(String s, String t) {
        int []tab1=new int[26];
        int []tab2=new int[26];

        for(int i=0;i<s.length();i++) tab1[s.charAt(i)-'a']+=1;
        for(int i=0;i<t.length();i++) tab2[t.charAt(i)-'a']+=1;
        
        for(int i=0;i<26;i++){
            if(tab1[i]!=tab2[i]){
                return false;
            }
        }
        return true;
    }
}
