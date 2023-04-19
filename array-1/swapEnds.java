public int[] swapEnds(int[] nums) {
  if(nums.length>=2){
    int swap=0;
    swap =nums[nums.length-1];
    nums[nums.length-1]=nums[0];
    nums[0] = swap;
    return nums;
  }
  return nums;
}
