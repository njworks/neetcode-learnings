class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int counterLeft = 0;
        int counterRight = numbers.length - 1;
        while(true){
            int sum = numbers[counterLeft] + numbers[counterRight];
            if (sum > target){
                counterRight--;
            } else if (sum < target){
                counterLeft++;
            } else {
                return new int[]{counterLeft + 1, counterRight + 1};
            }
        }
    }
}
