import java.util.Scanner;
public class L020207{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[11];
    for ( int count = 0; count < a.length; count++){
      a[count] = sc.nextInt();
      int Counter = 0;
      for( int count1 = 0; count1 < count; count1++){
        if( a[count] == a[count1] ){
            Counter++;
        }
        else{
        }
        if( Counter == 4){
          System.out.println("Enter another number");
        count--;
        }
      }
    }
    for ( int count = 0; count < a.length; count++){
        System.out.println(a[count]);
  }
}
}