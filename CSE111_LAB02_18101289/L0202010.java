import java.util.Scanner;
public class L0202010{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        int b[] = new int[10];
        System.out.println("Enter quantity");
        int x = sc.nextInt();
        for(int count = 0; count < x; count++){
            int y = sc.nextInt();
            
            for(int count2 = 0; count2 < a.length ; count2++){
                if(y == count2){
                    a[count2]++;
                    
                }
            }
        }
        for( int count = 0; count < a.length; count++){
            if(a[count] >= 2 && a[count] < 5){
                System.out.println(b[count]);
                
            }
            
        }
    }
}