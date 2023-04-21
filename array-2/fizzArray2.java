public String[] fizzArray2(int n) {
  String[] fizzArray2 = new String [n];
  if(n==0){
  return new String[0];
  }
  for(int i=0; i<=n-1; i++){
    fizzArray2[i] =String.valueOf(i);
  }
  return fizzArray2;
}
