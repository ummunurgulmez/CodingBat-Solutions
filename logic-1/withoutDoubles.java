public int withoutDoubles(int die1, int die2, boolean noDoubles) {
  if(noDoubles == true && die1==die2 &&die1!=6){
    return die1+die2+1;
  }
  if(die1==die2 && die1==6 && noDoubles ==true){
    return die1+1;
  }
  return die1+die2;
}
