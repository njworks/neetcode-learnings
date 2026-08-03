class Solution {
    public String encode(List<String> strs) {
        // StringJoiner strJoiner = new StringJoiner("");

        // strs.forEach(str -> strJoiner.add(str.length()+"#"+str));

        // return strJoiner.toString();

        return strs.stream().map(str -> str.length()+"#"+str).collect(Collectors.joining(""));
    }

    public List<String> decode(String str) {
        System.out.println(str);
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = str.indexOf('#', i);
            int lengthOfString = Integer.parseInt(str.substring(i, j));
            result.add(str.substring(j + 1, j + 1 + lengthOfString));

            i = j + 1 + lengthOfString;
        }

        return result;
    }
}
