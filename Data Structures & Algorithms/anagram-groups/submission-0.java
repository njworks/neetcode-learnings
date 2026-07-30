class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> sortedChars = new HashMap<>();

        for(String value: strs){
            char[] characterValue = value.toCharArray();
            Arrays.sort(characterValue);
            String key = String.valueOf(characterValue);

            if(sortedChars.containsKey(key)){
                List<String> values = sortedChars.get(key);
                values.add(value);
                sortedChars.put(key, values);
            } else {
                sortedChars.put(key, new ArrayList<>(Arrays.asList(value)));
            }
        }

        return sortedChars.values().stream().toList();
    }
}
