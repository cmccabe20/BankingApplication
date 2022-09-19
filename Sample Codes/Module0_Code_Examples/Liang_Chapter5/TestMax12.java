//package chapter5;

public class TestMax {


	public static void main(String[] args) {
		int i = 5;
		int j = 2;
    int k = max(i, j);
    print1(i, j, k);
    i = 10;
    j = 20;
    int z = max(i, j);
    print1(i, j, z);
    int y = max(j, i);
    print1(j, i, y);
    int w = max(100, 1000);
    print1(10, 1000, w);
	}

  /** Return the max between two numbers */
  public static int max(int num1, int num2) {
    int result;

    if (num1 > num2)
      result = num1;
    else
      result = num2;

    return result;
  

   public static void print1(int num1, int num2, int num3){
     System.out.println("The maximum between " + num1 +
      " and " + num2 + " is " + num3);
   }

}
