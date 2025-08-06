class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result="";

        for(int i=0;i<strs[0].length();i++){
            char ch=strs[0].charAt(i);
            boolean isaval=true;
            for(int j=0;j<strs.length;j++){
               
                if (i >= strs[j].length() || strs[j].charAt(i) != ch){
                    isaval=false;
                    break;
                }
            }
            if(isaval){
                result+=ch;
            }else{
                return result;
            }
        }
        return result;
    }
}
