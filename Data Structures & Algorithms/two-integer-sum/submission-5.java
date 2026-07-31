class Solution {
    public int[] twoSum(int[] nums, int target) {
        int firstIndex = 0;
        int secondIndex = 0;
        int numsLength = nums.length;

        while(true){
            for(int i = firstIndex; i < numsLength; i++){
                if(firstIndex == i) continue;

                if((nums[i] + nums[firstIndex]) == target){
                    int[] indexes = {firstIndex, i};
                    return indexes;
                }
            }
            firstIndex++;
        }
    }
}
