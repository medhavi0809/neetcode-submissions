class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> sorted = new HashMap<>();
        for(String s:strs){
            char[] charArray=s.toCharArray();
            Arrays.sort(charArray);
            String sorteds=new String(charArray);
            sorted.putIfAbsent(sorteds,new ArrayList<>());
            sorted.get(sorteds).add(s);
        }
        return new ArrayList<>(sorted.values());
    }
}
