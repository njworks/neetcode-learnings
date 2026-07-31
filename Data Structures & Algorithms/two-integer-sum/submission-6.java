class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> checkProcessedValuesWithIndex = new HashMap<>();
        int firstIndex = 0;
        int secondIndex = 0;
        for(int i = 0; i < nums.length; i++){
            int remaining = target - nums[i];
            if(checkProcessedValuesWithIndex.containsKey(remaining)){
                firstIndex = checkProcessedValuesWithIndex.get(remaining);
                secondIndex = i;
                break;
            } else {
                checkProcessedValuesWithIndex.put(nums[i], i);
            }
        }

        int[] indexes = {firstIndex, secondIndex};
        return indexes;
    }
}
