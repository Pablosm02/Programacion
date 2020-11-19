package U3.T3;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca seis digitos para la primera tabla");
        int array1[]=new int[7];
        int i;
        for (i=1;i<=6;i++){
            array1[i]=sc.nextInt();
        }
        System.out.println("Introduzca seis digitos para la segunda tabla");
        int array2[]=new int[7];
        int t;
        for(t=1;t<=6;t++){
            array2[t]=sc.nextInt();
        }
        int z;
        int u;
        String s1="";
        String s2="";
        for (z=1;z<=6;z++){
            s1= s1+array1[z]+" ";
        }
        for (u=1;u<=6;u++){
            s2=s2+array2[u]+" ";
        }
        System.out.println(s1+s2);
    }
}
