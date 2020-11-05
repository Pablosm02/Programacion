package U3.t1;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("introduzca un caracter por favor");
            String letra=sc.nextLine();
            letra=letra.toUpperCase();
            if (letra.length()>1){
                System.out.println("ha introducido mas de un caracter");

            }

            if (funcion1(letra)==true){
                System.out.println("la letra introducida si era una vocal");

            }
            else {
                System.out.println("la letra introducida no era una vocal");
            }


    }
    public static Boolean funcion1( String a){
        boolean boo;

        if ( a.charAt(0)=='A'
           ||a.charAt(0)=='E'
           ||a.charAt(0)=='I'
           ||a.charAt(0)=='O'
           ||a.charAt(0)=='U')
            return true;

        else{
            return false;
        }
    }

}
