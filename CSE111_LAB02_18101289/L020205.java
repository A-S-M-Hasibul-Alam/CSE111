import java.util.Scanner;
public class L020205{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double I;
        int  E, R, f, L, C;
        System.out.println("Voltage");
        E = sc.nextInt();
        System.out.println("Resistance");
        R = sc.nextInt();
        System.out.println("frequency");
        f = sc.nextInt();
        System.out.println("inductance");
        L = sc.nextInt();
        System.out.println("Capacitance");
        C = sc.nextInt();
        
        I = E/Math.sqrt((Math.pow(R,2))+(Math.pow((2*(Math.PI)*f*L)-(1/2*(Math.PI)*f*C),2)));
        System.out.println(I);
    }
}

        
        