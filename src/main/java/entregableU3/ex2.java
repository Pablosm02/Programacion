package entregableU3;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("introduzca un numero para pasar a morse por favor");
        int num=sc.nextInt();
        System.out.println("el numero pasado a morse es: "+convierteEnMorse(num));
    }
    public static String convierteEnMorse(int n){
        String s=n+"";
        int i;
        String s1="";
        for (i=0;i<=s.length()-1;i++){
            if (s.charAt(i)=='1'){
                s1 = s1 + ". _ _ _ _ ";
            }
            if (s.charAt(i)=='2'){
                s1=s1+". . _ _ _ ";
            }
            if (s.charAt(i)=='3'){
                s1=s1+". . . _ _ ";
            }
            if (s.charAt(i)=='4'){
                s1=s1+". . . . _ ";
            }
            if (s.charAt(i)=='5'){
                s1=s1+". . . . . ";
            }
            if (s.charAt(i)=='6'){
                s1=s1+" _ . . . .";
            }
            if (s.charAt(i)=='7'){
                s1=s1+" _ _ . . .";
            }
            if (s.charAt(i)=='8'){
                s1=s1+"_ _ _ . .";
            }
            if (s.charAt(i)=='9'){
                s1=s1+"_ _ _ _ .";
            }
            if (s.charAt(i)=='0'){
                s1=s1+"_ _ _ _ _";
            }
        }
        return s1;
    }
}
