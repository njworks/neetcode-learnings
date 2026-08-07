class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];

        int prefix = 1;
        for(int i = 0; i < nums.length; i++){
            output[i] = prefix;
            prefix *= nums[i];
        }

        int postfix = 1;
        for(int j = nums.length -1; j >= 0; j--){
            output[j] *= postfix;
            postfix *= nums[j];
        }
        // complexity stays at o(n)
        return output; //o(1) space
    }
}  
