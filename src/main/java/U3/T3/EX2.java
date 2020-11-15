package U3.T3;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("introduzca la cantidad de numeros que quiere almacenar");
        int num=sc.nextInt();
        System.out.println("introduzca los numeros que desea almacenar");
        int tabla[];
        tabla=new int[num];
        int i;
        for (i=0; i<num;i++){
            tabla[i]=sc.nextInt();
        }
        int t;
        String s="";

        for (t=0;t<num;t++){
            s=tabla[t]+" "+s;
        }
        System.out.println(s);
    }
}
