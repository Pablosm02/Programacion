package U3.t1;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("introduzca un valor");
        int num1=sc.nextInt();
        System.out.println("introduzca otro valor");
        int num2=sc.nextInt();
        if (num1<num2){
             funcion1(num1, num2);}
        else{
            funcion1(num2, num1);
        }
    }
    public static void funcion1(int a,int b){
        int i;
        for (i=a; i<b-1;i++){
            a=a+1;
            System.out.println(a);


        }

    }
}
