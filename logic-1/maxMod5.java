public int maxMod5(int a, int b) {
  int min=0;
  int max=0;
  if(a>b){
    min=b;
    max=a;
  }
  if(b>a){
    min=a;
    max=b;
  }
  if(a%5 ==b%5){
    return min;
  }
  if(a==b){
    return 0;
  }
  return max;
}
