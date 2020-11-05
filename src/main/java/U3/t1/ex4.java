package U3.t1;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("introduzca un numero entero");
        int num1=sc.nextInt();
        System.out.println("introduzca otro numero entero");
        int num2=sc.nextInt();
        System.out.println("el mayor numero de los que ha introducido ha sido " + funcion1(num1,num2));


    }
    public static int funcion1(int a,int b){
        int p;
        if (a>b){
            p=a;
        }
        else{
            p=b;
        }
        return p;
    }
}
