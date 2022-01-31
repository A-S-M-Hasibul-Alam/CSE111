import java.util.*;
public class Problem09{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String n = sc.nextLine();
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = a+b*0.15;
    System.out.printf("TOTAL = R$ "+"%.2f",c);
  }
}
