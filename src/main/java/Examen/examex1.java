package Examen;

import java.util.Scanner;

public class examex1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        String ss="abcdefghijklmnñopqrstuvwxyz";
        int s=n/2;
    String s1="";
    String espacio="";
    int cont=0;
    int t;
    int r;
    int l=n-1;
    String s2="";
    int calo=n;
        for (i=1;i<=calo;i++){
            for (t=1;t<=n;t++){
                if (cont<n) {
                    s1 = s1 + ss.charAt(cont);

                    cont = cont + 1;

                }

            }
            for (r=1;r<=n;r++){
                if (l>0) {
                    l = l - 1;
                    s2 = s2 + ss.charAt(l);


                }

            }
            System.out.println(espacio+s1+s2);
            espacio=espacio+" ";
            n=n-1;
            cont=0;
            l=n-1;
            s1="";
            s2="";




        }
    }
}
