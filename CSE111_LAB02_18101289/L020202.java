import java.util.Scanner;
public class L020202{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[10];
    
    for ( int count = 0; count < a.length; count++){
      a[count] = sc.nextInt();
      System.out.print("You have entered ");

      for( int count1 = 0; count1 <= count; count1++){
          System.out.print(" " + a[count1]);

    
  }
}
}
}