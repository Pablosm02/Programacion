package U3;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double[] num= {};
        num= new double [5];
        int i;
        for (i=0; i<=4;i++){
            System.out.println("introduzca un numero decimal por favor");
            num[i] = sc.nextDouble();
            while (num[i]%1==0)  {
                System.out.println("introduzca un numero DECIMAL por favor");
                num[i]= sc.nextDouble();
            }

        }
        int t;
        String n="";
        n=num[0]+"";
        for (t=1; t<=4;t++){
            n=n+"//"+num[t];

        }
        System.out.println(n);
    }
}
