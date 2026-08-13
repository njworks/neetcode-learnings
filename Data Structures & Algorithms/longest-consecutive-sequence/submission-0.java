class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numsSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());

        int highestCounter = 0;

        for (Integer num : numsSet) {
            if (!numsSet.contains(num - 1)) {
                int counter = 1;

                while (numsSet.contains(num + counter)) {
                    counter++;
                }

                highestCounter = Math.max(highestCounter, counter);
            }
        }

        return highestCounter;
    }
}
