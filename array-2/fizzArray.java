public int[] fizzArray(int n) {
  int[] fizzArray = new int [n];
  if(n==0){
  return new int[0];
 
  }
  for(int i=0; i<=n-1; i++){
    fizzArray[i] = i;
  }
  return fizzArray;
}
