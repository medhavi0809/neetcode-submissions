class Solution {
    public boolean isAnagram(String s, String t) {
int freq[]=new int[6536];
if(s.length()!=t.length()){
    return false;
}
for(int i=0;i<s.length();i++){
    freq[s.charAt(i)]++;
}
for(int j=0;j<t.length();j++){
    freq[t.charAt(j)]--;
}
for(int i:freq){
    if(i!=0)
    return false;
}
return true;
    }
}
