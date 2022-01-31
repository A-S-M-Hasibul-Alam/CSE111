import java.util.Scanner;
public class L0206{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[15];
    for ( int count = 0; count < a.length; count++){
      if( 0 <= a[count] || a[count] <= 9){
      a[count] = sc.nextInt();
    }
      else{
        count--;
      }
    }
    int b[] = {0,1,2,3,4,5,6,7,8,9};
    for ( int count = 0; count < b.length; count++){
      int counter = 0;
      for ( int count1 = 0; count1 < a.length; count1++){
        if( b[count] == a[count1]){
          counter++;
        }
        }
      System.out.println(count + " " + counter + " times");
    }
  }
}
       