public boolean either24(int[] nums) {
  boolean statement_two=false, statement_four=false;
   for(int i=0; i<nums.length; i++){
     if(nums[i] ==2 &&  i!=nums.length-1 && nums[i+1] ==2 ){
       statement_two = true;
     }
     else if(nums[i] ==4 && i!= nums.length-1 && nums[i+1] ==4){
       statement_four = true;
     }
} 
if(statement_two == true && statement_four == false || statement_two == false && statement_four == true){
return true;
}
return false;
}
