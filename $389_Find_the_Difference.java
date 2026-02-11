class Solution {
    public char findTheDifference(String str1, String str2) {
        int num1=0,num2=0;
        for (int i = 0; i < str1.length(); i++) {
            char ch1 = str1.charAt(i);
            num1 =(int) num1+ch1;
        }
        for (int j = 0; j < str2.length(); j++) {
            char ch2 = str2.charAt(j);
            num2 = (int) num2 + ch2;
        }
        return (char) (num2 - num1);
        
    }
}
