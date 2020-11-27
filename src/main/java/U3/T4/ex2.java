package U3.T4;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String colores[]=new String [9];
        colores[0]="rojo";
        colores[1]="verde";
        colores[2]="azul";
        colores[3]="amarillo";
        colores[4]="naranja";
        colores[5]="rosa";
        colores[6]="negro";
        colores[7]="blanco";
        colores[8]="morado";
        System.out.println("introduce 8 palabras a continuacion");
        String input[]=new String[8];
        int i;
        for (i=0;i<=7;i++){
            input[i]=sc.nextLine();
        }
        int t;
        int h;
        int cont2=0;
        int cont=0;


        int aux[]=new int[8];
        for (t=0;t<=7;t++){
            if (input[t].equals("rojo")||input[t].equals("verde")||input[t].equals("azul")||input[t].equals("amarillo")||
                    input[t].equals("naranja")||input[t].equals("rosa")||input[t].equals("negro")||input[t].equals("blanco")||input[t].equals("morado")){
                cont=cont+1;
            }
            else{
                cont2=cont2+1;
            }
        }

        String a1[]=new String[cont];
        String a2[]=new String[cont2];
        int q;
        int l;
        int ñ;
        int contaux=0;
        int contaux2=0;
        for (q=0;q<=7;q++){
            if (input[q].equals("rojo")||input[q].equals("verde")||input[q].equals("azul")||input[q].equals("amarillo")||
            input[q].equals("naranja")||input[q].equals("rosa")||input[q].equals("negro")||input[q].equals("blanco")||input[q].equals("morado")){
                a1[contaux]=input[q];
                contaux=contaux+1;
            }
            else{
                a2[contaux2]=input[q];
                contaux2=contaux2+1;
            }
        }


        for (h=0; h<=cont-1;h++){
            System.out.println(a1[h]);
        }
        int u;
        for (u=0; u<=cont-1;u++){
            System.out.println(a2[u]);
        }
        int ultcont=0;
        String afinal[]=new String[8];
        int r;
        for (r=0;r<=7;r++){
            if (r<cont){
                afinal[r]=a1[r];
            }
            else {
                afinal[r]=a2[ultcont];
                ultcont=ultcont+1;
            }
        }
        int v;
        for (v=0;v<=7;v++){
            System.out.println((v+1)+". "+afinal[v]);
        }

    }
}
