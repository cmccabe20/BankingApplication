//package chapter5;

public class Increment {

  static int x;

  public static void main(String[] args) {
    int x = 1;
    System.out.println("Before the call, x is " + x);
    increment(x);
    System.out.println("after the call, x is " + x);
    x++;
    System.out.println("x in method main is now " + x);
  }

  public static void increment(int n) {
    n++;
    System.out.println("n inside the method is " + n);
    x++;
    System.out.println("x in method increment is now " + x);
  }
}
