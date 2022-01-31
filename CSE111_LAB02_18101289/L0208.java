import java.util.Scanner;
public class L0208{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[10];
    for ( int count = 0; count < a.length; count++){
      a[count] = sc.nextInt();
      for( int count1 = 0; count1 < count; count1++){
        if( a[count] == a[count1] ){
          System.out.println("Enter another number");
        count--;
        }
      }
    }
  }
}