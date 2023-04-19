public boolean more14(int[] nums) {
  int sum1=0;
  int sum4=0;
  for(int i=0; i<nums.length; i++){
    if(nums[i] == 1){
      sum1+=1;
    }
    if(nums[i] == 4){
      sum4+=1;
    }
  }
  if(sum1 > sum4){
    return true;
  }
  return false;
}
