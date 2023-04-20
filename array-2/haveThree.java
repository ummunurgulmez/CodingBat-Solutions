public boolean haveThree(int[] nums) {
  int sum = 0;
  boolean lastWasThree = false;  
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 3) {
      if (lastWasThree) {  
        lastWasThree = false;
      } else if (i < nums.length - 1 && nums[i + 1] == 3) {
        lastWasThree = true;
        sum += 1;
      } else {
        sum += 1;
      }
    } else {
      lastWasThree = false;
    }
  }
  return sum == 3;  
