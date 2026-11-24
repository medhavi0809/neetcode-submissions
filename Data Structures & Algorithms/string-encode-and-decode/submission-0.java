

class Solution {
    // Encode as: <len>#<string><len>#<string>...
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        if (strs == null) return "";          // choose behavior for null if needed
        for (String s : strs) {
            if (s == null) s = "";            // decide how you want to treat nulls
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        if (s == null || s.length() == 0) return result;
        int i = 0;
        while (i < s.length()) {
            int j = i;
            // find '#'
            while (j < s.length() && s.charAt(j) != '#') j++;
            int len = Integer.parseInt(s.substring(i, j));
            j++; // skip '#'
            String str = s.substring(j, j + len);
            result.add(str);
            i = j + len;
        }
        return result;
    }
}