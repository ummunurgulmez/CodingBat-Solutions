public int[] post4(int[] nums) {
    int index = nums.length - 1;
    while (nums[index] != 4) {
        index--;
    }
    int[] result = new int[nums.length - 1 - index];
    for (int i = 0; i < result.length; i++) {
        result[i] = nums[index + 1 + i];
    }
    return result;
}
