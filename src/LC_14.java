public class LC_14 {
}
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length <= 0)
            return "";
        String s = "";
        int i = 0;
        int min = Integer.MAX_VALUE;
        for(String ss : strs){
            if(ss.length() < min)
                min = ss.length();
        }

        boolean flag = true;
        while(i < min && flag){
            char c = strs[0].charAt(i);
            for(String ss : strs){
                if(ss.charAt(i) == c){
                    continue;
                }else{
                    flag = false;
                    break;
                }
            }
            i++;
            if(flag)
                s += c;
        }
        return s;
    }
}