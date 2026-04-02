class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> bucket = new HashMap<>();
        for(String s : strs){
            char[] string = s.toCharArray();
            Arrays.sort(string);
            String key = new String(string);
            bucket.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(bucket.values());
    }
}
