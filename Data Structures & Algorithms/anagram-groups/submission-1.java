class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Map<Character, Long>,List<String>> charactersByNumber = new HashMap<>();

        for(String value: strs){
            char[] characters = value.toCharArray();
            Map<Character, Long> countCharacter = value.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(java.util.function.Function.identity(), Collectors.counting()));

            if(charactersByNumber.containsKey(countCharacter)){
                List<String> values = charactersByNumber.get(countCharacter);
                values.add(value);
                charactersByNumber.put(countCharacter, values);
            } else {
                charactersByNumber.put(countCharacter, new ArrayList<>(List.of(value)));
            }    
        }

        return new ArrayList<>(charactersByNumber.values());
    }
}
