//package chapter5;

public class TestVoidMethod {
  public static void main(String[] args) {
    System.out.print("The grade is ");
    printGrade(78.5);

    System.out.print("The grade is ");
    printGrade(59.5);
    printGrade(61.4, 33);
  }

  public static void printGrade(double score, int age){
    printGrade(score);
    System.out.println("Age is "+age);
  }

  public static void printGrade(double score) {
    if (score >= 90.0) {
      System.out.println('A');
    } 
    else if (score >= 80.0) {
      System.out.println('B');
    } 
    else if (score >= 70.0) {
      System.out.println('C');
    } 
    else if (score >= 60.0) {
      System.out.println('D');
    } 
    else {
      System.out.println('F');
    }
    return;
  }
}
