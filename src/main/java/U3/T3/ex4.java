package U3.T3;

import java.util.Scanner;
import java.lang.Math;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("introduce la longitud de la clave");
        int longi=sc.nextInt();

        while (longi<0||longi>99999) {
            System.out.println("introduce la longitud de la clave(de 1 a 5 digitos)");

            longi=sc.nextInt();
        }
        int pow= (int) Math.pow(10,longi);
        int num= (int) Math.floor(Math.random()* Math.pow(10,longi));
        int numaux=num;
        System.out.println(num);

        int array[]=new int [longi];
        int i;

        for (i=longi-1;i>=0;i--){

            if (num>10) {

                numaux=num%10;
                num=num/10;
                array[i]=numaux;
            }
            else {

                numaux=num;
                array[i]=numaux;
            }


            

        }
        int t;
        int array2[]= new int [longi];

        int h;
        int aux;

            int y;
        for (y=0;y<=longi-1;y++){
            System.out.println("su array numero "+array2[y]+ " es "+ array2[y]);
        }
        int cont=0;
        int k;
        while (cont<3){
            System.out.println("introduzca el numero que crees que va a ser:");
            int intro=sc.nextInt();
            for (h=longi-1;h>=0;h--){

                if (intro>10) {

                    aux=intro%10;
                    intro=intro/10;
                    array2[h]=aux;
                }
                else {

                    aux=intro;
                    array2[h]=aux;
                }




            }


            cont=0;
            for (k=0;k<=longi-1;k++){
                if (array[k]==array2[k]){
                    System.out.println(array2[k]+" es igual");
                    cont=cont+1;
                }
                else{
                    if (array[k]<array2[k]){
                        System.out.println(array2[k]+ " es mayor");
                    }
                    else {
                        System.out.println(array2[k]+ " es menor");
                    }
                }
            }

        }
        System.out.print("¡¡¡ENHORABUENA!!!");

    }
}
