class Solution {
    public boolean isPalindrome(String s) {
        int start=0;
        int last=s.length()-1;
        char[] st=s.toCharArray();
        
        while(start<last){
            while (start < last && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }

            while (start < last && !Character.isLetterOrDigit(s.charAt(last))) {
                last--;
            }
            if(Character.toLowerCase(st[start])!=Character.toLowerCase(st[last])){
                return false;
            }
            start++;
                last--;

        }
        return true;
    }
}
