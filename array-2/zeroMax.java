public int[] zeroMax(int[] nums) {
   int[] result = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 0) { 
            int maxOdd = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] % 2 != 0 && nums[j] > maxOdd) { 
                    maxOdd = nums[j];
                }
            }
            result[i] = maxOdd; 
        } else {
            result[i] = nums[i]; 
        }
    }
    return result;
}


