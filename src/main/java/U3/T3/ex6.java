package U3.T3;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Introduzca los 6 primeos datos por favor:");
        int array[]=new int [6];
        for (i=0;i<=5 ;i++){
            array[i]=sc.nextInt();

        }
        System.out.println("introduzca los 6 datos restantes:");
        int array2[]=new int [6];
        int t;
        for (t=0;t<=5;t++){
            array2[t]=sc.nextInt();
        }
        String s="";
        int m;
        int u;
        int arraytotal[]=new int [12];
        for (m=0;m<=11;m++) {
            if (m < 6) {
            arraytotal[m]=array[m];
            }
            else{
                arraytotal[m]=array2[m-6];
            }
            System.out.println(arraytotal[m]);

        }
        sinRepetidos(arraytotal) ;



    }
    static void sinRepetidos(int [] y){
        int length=y.length;
        int cont=0;
        if (length<2){
            return;
        }
        int h;
        int j;

        for (h=0;h<=11;h++){
            for (j=11;j>=h+1;j--){
                if (y[h]==y[j]){
                    cont=cont+1;
                    length=length-1;

                }
                else {
                    System.out.println(y[h]);
                }
            }


        }
        int nuevo[]=new int [length];
        int p;
        int s;
        for (p=0;p<=length;p++) {

            for (s=11;s>=p+1;s--){
                if (y[p]==y[s]){



                }
                else {
                    nuevo[s]=y[p];
                }
            }
        }
        int f;
        for (f=0;f<=length-1;f++) {
            System.out.println("este es "+nuevo[f]);
        }

    }

    public static class exarrays {
        public static void main(String[] args) {
            int array2[][]=new int [6][10];
            int i;
            int t;
            for (t=0;t<6;t++) {
                for (i = 0; i < 10; i++) {
                    array2[t][i] = (int) (Math.random() * 1000);


                }
            }
            int j;
            int k;
            for (j=0;j<6;j++){
                for (k=0;k<10;k++){
                    System.out.println(array2[j][k]);
                }
            }
        }
    }
}
