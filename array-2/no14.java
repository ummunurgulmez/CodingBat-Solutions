public boolean no14(int[] nums) {
  boolean one = false, four=false;
  for(int i=0; i< nums.length; i++){
    if(nums[i] ==1){
      one = true;
    }
    if(nums[i] ==4){
      four = true;
    }
  }
  if(one == true && four == true){
    return false;
  }
    return true;
  }



