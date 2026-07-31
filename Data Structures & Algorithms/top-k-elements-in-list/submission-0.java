class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Long> countNums = Arrays.stream(nums).boxed()
                                        .collect(
                                            Collectors.groupingBy(java.util.function.Function.identity(), Collectors.counting()));

        return countNums.entrySet().stream()
                .sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
                .limit(k)
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }
}
