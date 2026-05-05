class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> ans=new HashMap<>();
        

        for(int i=0;i<strs.length;i++){
            String s=strs[i];
            int []tab=new int[26];
            for(int j=0;j<s.length();j++) tab[s.charAt(j)-'a']+=1;
            String hashKey=Arrays.toString(tab);
            if(!ans.containsKey(hashKey)){
                ans.put(hashKey,new ArrayList<>());
            }
            ans.get(hashKey).add(s);
        }

        return new ArrayList<>(ans.values());
    }
}
