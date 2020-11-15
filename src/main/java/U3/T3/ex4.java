package U3.T3;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca longitud de la clave");
        int longi=sc.nextInt();

        int num=(int) (Math.random()*Math.pow(10, longi) + Math.pow(10,longi-1));
        System.out.println(num);
        String s= String.valueOf(num);
        int i;
        String array[]=new String[longi];
        int cont = 0;
        System.out.println("intente acertar la clave generada");
        String s3="";

        for (i = 0; i < longi; i++) {
                cont=0;

                int p=sc.nextInt();
                String s2=String.valueOf(p);
            int n1 = Integer.parseInt(array[i]);
            s3 = Character.toString(s2.charAt(i));
            int n2=Integer.parseInt(s3);
            if (n1==n2){
                System.out.println(n1 + "es igual");
                cont = cont+1;
            }
            if (n1<n2){

                System.out.println(n1 + "es menor");
            }
            else{
                System.out.println(n1+" es mayor");
            }





        }
    }




}

