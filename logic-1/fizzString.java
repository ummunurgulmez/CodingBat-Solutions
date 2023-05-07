//The first solution

public String fizzString(String str) {
   if (str.startsWith("f") && str.endsWith("b")){
    return "FizzBuzz";
  }
  if(str.startsWith("f")){
    return "Fizz";
  }
  if(str.endsWith("b")){
    return "Buzz";
  }
  return str;
}

//The Second Solution

public String fizzString(String str) {
  boolean startsWithF = str.startsWith("f");
  boolean endsWithB = str.endsWith("b");
  
  if (startsWithF && endsWithB) {
    return "FizzBuzz";
  } 
  else if (startsWithF) {
    return "Fizz";
  } 
  else if (endsWithB) {
    return "Buzz";
  } 
  else {
    return str;
  }
}
