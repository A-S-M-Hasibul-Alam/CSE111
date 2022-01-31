import java.util.Scanner;
public class L020206{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        int sum = 0;
        while( count <= n ){
            if( count % 2 == 0){
                sum = sum - (count*count);
            }
            else{
                sum = sum + ( count*count);
            }
            count++;
        }
        System.out.println(sum);
    }
}

       