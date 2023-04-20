public int[] tenRun(int[] nums) {
  int multipleOfTen = -1;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] % 10 == 0) {
      multipleOfTen = nums[i];
    } else if (multipleOfTen != -1) {
      nums[i] = multipleOfTen;
    }
  }
  return nums;
}
