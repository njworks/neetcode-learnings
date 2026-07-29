class Solution {
    public int[] twoSum(int[] nums, int target) {
        // First Solution
        // int firstIndex = 0;
        // int secondIndex = 0;
        // int numsLength = nums.length;

        // while(true){
        //     for(int i = firstIndex; i < numsLength; i++){
        //         if(firstIndex == i) continue;

        //         if((nums[i] + nums[firstIndex]) == target){
        //             int[] indexes = {firstIndex, i};
        //             return indexes;
        //         }
        //     }
        //     firstIndex++;
        // }

        // Second Solution
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
