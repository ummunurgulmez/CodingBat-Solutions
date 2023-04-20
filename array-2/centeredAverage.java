public int centeredAverage(int[] nums) {
  int sum = 0;
  int min = nums[0];
  int max = nums[0];
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] < min) {
      min = nums[i];
    } else if (nums[i] > max) {
      max = nums[i];
    }
    sum += nums[i];
  }
  sum = sum - min - max;
  int average = sum / (nums.length - 2);
  return average;
}
