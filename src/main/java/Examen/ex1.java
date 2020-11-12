package Examen;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("introduzca un numero entero por favor");
        Long num1=sc.nextLong();
        int i;
        int aux=0;
        String s1;
        String contpares="";
        int sumapares=0;
        String contimpares="";
        int sumaimpares=0;
        s1=num1.toString();
        int longi;
        char saux;
        longi=s1.length();
        int cont=0;
        int slongi=longi;
        for (i=1;i<=longi;i++) {
            aux = Math.toIntExact(num1 % 10);
            saux=(s1.charAt(cont));

            if (aux%2==0){
                contpares=contpares+saux+" ";
                sumapares=sumapares+aux;
            }
            else{
                contimpares=contimpares+saux+" ";
                sumaimpares=sumaimpares+aux;
            }
            num1=num1/10;
            slongi=slongi-1;
            cont=cont+1;

        }
         System.out.println("digitos pares:" + contpares);
        System.out.println("digitos impares:"+ contimpares);
        System.out.println("suma pares: "+sumapares);
        System.out.println("suma impares: "+sumaimpares);



    }
}

