import java.util.Scanner;
public class L020201{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[10];
    for ( int count = 0; count < a.length; count++){
      a[count] = sc.nextInt();
    }
    for( int count = a.length-1; 0 <= count; count--){
      System.out.println(a[count]);
    }
  }
}
         