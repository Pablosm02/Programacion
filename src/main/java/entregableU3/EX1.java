package entregableU3;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("inreoduzca la longitud del array");
        int longi=sc.nextInt();
        int array[]=new int [longi];
        int i;
        for (i=0;i<longi;i++){
            array[i]=sc.nextInt();

        }
        filtraprimos(array);


    }
    public static void filtraprimos(int array[]) {
        int cont = 1;
        int i;
        int t;
        int g;
        int primos[]=new int [100];
        int m=0;
        int numero;
        boolean s = false;
        for (g=0;g<array.length;g++) {
            numero=array[g];

                cont = 1;

                s = false;
                for (i = 1; i <= numero; i++) {
                    cont = cont + 1;
                    if (cont >= numero)
                        cont = numero - 1;
                    if (numero==1){
                        continue;
                    }
                    if (s == false) {
                        if (numero % cont == 0) {
                            s = true;
                        } else {
                            s = false;
                        }
                    }
                }

                if (s == false) {
                    primos[m]=array[g];
                    m=m+1;
                    continue;
                }


        }
        int y;
        for (y=0;y<=m-1;y++){
            System.out.println((y+1)+"."+" "+primos[y]);
        }
    }
}

