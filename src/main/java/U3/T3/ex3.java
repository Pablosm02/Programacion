package U3.T3;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("introduzca el numero de datos que desea almacenar");
        int n=sc.nextInt();
                System.out.println(n);
        int tabla[]=new int [n];
        int cont=0;
        int contpos=0;
        int contneg=0;
        int sumaneg=0;
        int sumapos=0;
        int i;
        for (i=0;i<n;i++){
            tabla[i]=sc.nextInt();
            if (tabla[i]==0){
                cont=cont+1;
            }
            if (tabla[i]<0){
                contneg=contneg+1;
                sumaneg=sumaneg+tabla[i];
            }
            if (tabla[i]>0){
                contpos=contpos+1;
                sumapos=sumapos+tabla[i];
            }

        }
        System.out.println("la cantidad de ceros introducida es:"+ cont);
        System.out.println("la media de los numeros positivos introducidos es:"+ sumapos/contpos);
        System.out.println("la media de los numeros negativos introducidos es:"+ sumaneg/contneg);


    }
}
