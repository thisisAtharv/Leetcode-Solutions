class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()){
            if(Character.isLetterOrDigit(c)) sb.append(Character.toLowerCase(c));
        }
        int i=0;
        while(i<sb.length()/2){
            if(sb.charAt(i)!=sb.charAt(sb.length()-1-i)) return false;
            i++;
        }
        return true;
    }
}