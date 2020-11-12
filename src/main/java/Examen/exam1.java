package Examen;

import java.util.Scanner;

public class exam1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = "Limon";
        String s2 = "diamante";
        String s3 = "corazon";
        String s4 = "Herradura";
        String s5 = "campana";
        int num1 = (int) (Math.random() * 5);
        int num2 = (int) (Math.random() * 5);
        int num3 = (int) (Math.random() * 5);
        String e1 = "";
        String e2 = "";
        String e3 = "";


        if (num1 == 0) {

            e1 = s1;
        }
        if (num1 == 1) {

            e1 = s2;
        }
        if (num1 == 2) {

            e1 = s3;
        }
        if (num1 == 3) {

            e1 = s4;
        }
        if (num1 == 4) {
            e1 = s5;
        }
        if (num2 == 0) {

            e2 = s1;
        }
        if (num2 == 1) {

            e2 = s2;
        }
        if (num2 == 2) {

            e2 = s3;
        }
        if (num2 == 3) {
            ;
            e2 = s4;
        }
        if (num2 == 4) {

            e2 = s5;
        }
        if (num3 == 0) {

            e3 = s1;
        }
        if (num3 == 1) {

            e3 = s2;
        }
        if (num3 == 2) {

            e3 = s3;
        }
        if (num3 == 3) {

            e3 = s4;
        }
        if (num3 == 4) {

            e3 = s5;
        }
        String stotal = e1 + " " + e2 + " " + e3;
        System.out.println(stotal);
        char char1 = e1.charAt(3);
        char char2 = e2.charAt(3);
        char char3 = e3.charAt(3);
        int cont=0;
        if (char1 == char2 || char1 == char3 || char2 == char1 || char2 == char3 || char3 == char1 || char3 == char2) {
            if (char1 == char2) {
                if (char1 == char3) {
                    cont=cont+1;

                } else {
                    System.out.println("Enhorabuena, ha recuperado su moneda");
                    cont=cont+1;


                }
            }
            if (char2 == char3) {
                if (char2 == char1) {
                    cont=cont+1;
                } else {
                    System.out.println("Enhorabuena, ha recuperado su moneda");
                    cont=cont+1;
                }
            }
            if (char3 == char1) {
                if (char3 == char2) {
                    cont=cont+1;
                } else {


                    System.out.println("Enhorabuena, ha recuperado su moneda");
                    cont=cont+1;
                }
            }
        }

        if (cont>2){
            System.out.println("Enhorabuena, Ha ganado");
        }
        else if(cont<1){
            System.out.println("lo siento, ha perdido");
        }
    }
}
