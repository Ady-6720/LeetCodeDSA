/* ===============================================================================================================================
using sorting we clustered the array so all words will be in order, then we compare only first and last entry of the raay
while compairing we will keep adding characters at ith index while traversing through both
will break when the characters wont match
using string buildrr we will appen matching characters so we will get longest prefix
=================================================================================================================================*/
class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result=new StringBuilder();
        Arrays.sort(strs);
        char[] first=strs[0].toCharArray();
        char[] last=strs[strs.length-1].toCharArray();
        for(int i=0; i<first.length;i++){
            if(first[i]!=last[i])
                break;
            result.append(first[i]);
        }
        return result.toString();
    }
}
