//package chapter5;

public class TestMax {
  static boolean DEBUG = true; 
       
	/** Main method */
  public static void main(String[] args) {
    int i = 5;
    int j = 2;
    int k = max(i, j);
    System.out.println("The maximum between " + i +
      " and " + j + " is " + k);
  }

  /** Return the max between two numbers */
  public static int max(int num1, int num2) {
    int result;
    if(DEBUG)
	    System.out.println("I am at start num1 " + num1 + " num2 is "+ num2);

    if (num1 > num2){
	    if(DEBUG)
	      System.out.println("I am here " + num1);
      result = num1;
    }else{
	    if(DEBUG)
	      System.out.println("I am also here " + num2);
      result = num2;
    }

    return result;
  }
}
