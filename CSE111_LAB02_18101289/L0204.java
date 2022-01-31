import java.util.Scanner;
public class L0204{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[20];
    for ( int count = 0; count < a.length; count++){
      a[count] = sc.nextInt();
    }
    for( int count = a.length-1; 0 <= count; count--){
      if( a[count]%2 == 0){
      System.out.println(a[count]);
    }
  }
}
}
         