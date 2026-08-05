class Solution {
    public int[] productExceptSelf(int[] nums) {
       int[] output = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            Integer total = null;
            for(int j = 0; j < nums.length; j++){
                if(i == j) continue;
                if (total == null){
                    total = nums[j];
                    continue;
                }
                total = total * nums[j];
            }
            output[i] = total;
        }

        return output;
    }
}  
