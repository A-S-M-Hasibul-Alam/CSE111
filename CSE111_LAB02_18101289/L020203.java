import java.util.Scanner;
public class L020203{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        for(int count = 0; count < a.length; count++){
            a[count] = sc.nextInt();
        }
        for( int i = 0; i < a.length; i++){
            for( int j = i+1; j < a.length; j++){
                if( a[i] < a[j]){
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
            for( int i = 0; i < a.length; i++){
                System.out.println(a[i]);
            }
        }
    }


                    