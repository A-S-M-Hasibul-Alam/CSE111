import java.util.Scanner;
public class L020208{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        int b[] = new int[10];
        for(int count = 0; count < a.length; count++){
            a[count] = sc.nextInt();
            for(int count2 = 0; count2 < count ; count2++){
                if(a[count] == count2){
                    b[count2]++;
                    
                }
            }
        }
        for( int count = 0; count < a.length; count++){
            if(b[count] >= 2 && b[count] < 5){
                System.out.println(b[count]);
                
            }
            
        }
    }
}