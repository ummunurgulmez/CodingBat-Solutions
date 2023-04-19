public int[] maxEnd3(int[] nums) {
  int max = 0;
  if(nums[0] > nums[2]){
    max = nums[0];
  }
  else{
    max = nums[2];
  }
  return new int [] {max,max,max};
}
