public boolean twoTwo(int[] nums) {
  boolean two_two = true;
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] == 2) {
      if(i > 0 && nums[i-1] == 2) {
        // case where 2 appears after another 2
        continue;
      }
      if(i < nums.length - 1 && nums[i+1] == 2) {
        // case where 2 appears before another 2
        continue;
      }
      // case where 2 appears alone
      two_two = false;
      break;
    }
  }
  return two_two;
}
