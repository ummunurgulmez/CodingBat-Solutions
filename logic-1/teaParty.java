public int teaParty(int tea, int candy) {
  if(candy <5 || tea <5){
    return 0;
  }
  if(candy>=5 && tea>=5 && tea < 2*candy && candy < tea*2){
    return 1;
  }
   return 2;
}
