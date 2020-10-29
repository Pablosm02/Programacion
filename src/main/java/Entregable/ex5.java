package Entregable;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("introduzca una frase");
        String s1=sc.nextLine();
        int s2;
        s2=s1.length();
        int i;
        int posicion=-1;
        String s3;
        s3=s1.toUpperCase();
        int cont=0;
        for (i=1; i<s2+1;i++){
            posicion=posicion+1;
            if (s3.charAt(posicion)=='A'||s3.charAt(posicion)=='E' ||(s3.charAt(posicion)=='O')||s3.charAt(posicion)=='H'||s3.charAt(posicion)=='Á'||s3.charAt(posicion)=='É'||s3.charAt(posicion)=='Ó'||s3.charAt(posicion)==' '){
                cont=cont+1;
            }
        }
        System.out.println("La cantidad de espacios, haches y vocales abiertas es " + cont);
    }


}
