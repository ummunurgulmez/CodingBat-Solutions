public int bigDiff(int[] nums) {
  int min = nums[0];
  int max=nums[0];
  for(int i=0 ; i<nums.length-1; i++){
    min = Math.min(min,nums[i+1]);
    max = Math.max(max,nums[i+1]);
  }
  int difference= max-min;
  return difference;
}
