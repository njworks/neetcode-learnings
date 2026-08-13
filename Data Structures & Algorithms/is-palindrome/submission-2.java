class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 1) return true;

        String cleanedString = s.chars()
            .filter(c -> Character.isAlphabetic(c) || Character.isDigit(c))
            .mapToObj(c -> String.valueOf((char) c))
            .map(String::toLowerCase)
            .collect(Collectors.joining());

        System.out.println(cleanedString);

        StringBuilder reverse = new StringBuilder(cleanedString).reverse();
        return cleanedString.equals(reverse.toString());
    }
}
