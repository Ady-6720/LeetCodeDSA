class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()) return false;
        int[] alph_count=new int[26];
        for(int i=0; i<s.length();i++){
            alph_count[s.charAt(i)-'a']++;
            alph_count[t.charAt(i)-'a']--;
        }
        for(int count :alph_count){
            if(count!=0) return false;
        }
            return true;
    }

}
