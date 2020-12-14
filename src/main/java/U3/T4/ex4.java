package U3.T4;


import com.sun.jdi.IntegerValue;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class ex4 {


    public static void main(String[] args) {
        String posibilidades="";
        Scanner sc = new Scanner(System.in);
        String tablero[][] = new String[8][8];
        String lett = "abcdefgh";
        String num = "12345678";
        int i;
        int l;

        String s1 = "";
        String s2 = "";

        for (i = 0; i <= 7; i++) {
            s1 = s1 + lett.charAt(i);
            for (l = 0; l <= 7; l++) {
                s2 = s2 + num.charAt(l);
                tablero[i][l] = s1 + s2;
                s2 = "";

            }
            s1 = "";
        }
        for (int j = 0; j < tablero.length; j++) {
            System.out.println(Arrays.toString(tablero[j]));
        }


        System.out.println("introduce el lugar en el que se encuetnra el alfil");
        String pos = sc.nextLine();
        int h;
        int g;
        int d;
        int n;
        int a;
        int w;
        String numpos = pos.charAt(1) + "";

        String letrapos = "" + pos.charAt(0);
        int numlet = 0;
        if (letrapos.equals("a")) {
            numlet = 0;
        }
        if (letrapos.equals("b")) {
            numlet = 1;
        }
        if (letrapos.equals("c")) {
            numlet = 2;
        }
        if (letrapos.equals("d")) {
            numlet = 3;
        }
        if (letrapos.equals("e")) {
            numlet = 4;
        }
        if (letrapos.equals("f")) {
            numlet = 5;
        }
        if (letrapos.equals("g")) {
            numlet = 6;
        }
        if (letrapos.equals("h")) {
            numlet = 7;
        }

        String mov;



        int cont=Integer.parseInt(numpos);
        //arriba izq


        for (d=numlet-1;d>=0;d--){
            cont=cont-1;
            if (cont==0){
                break;
            }
            if (d==0){

                posibilidades=posibilidades+("a"+cont+" ");
            }
            if (d==1){

                posibilidades=posibilidades+("b"+cont+" ");
            }
            if (d==2){

                posibilidades=posibilidades+("c"+cont+" ");
            }
            if (d==3){

                posibilidades=posibilidades+("d"+cont+" ");
            }
            if (d==4){

                posibilidades=posibilidades+("e"+cont+" ");
            }
            if (d==5){

                posibilidades=posibilidades+("f"+cont+" ");
            }
            if (d==6){

                posibilidades=posibilidades+("g"+cont+" ");
            }
            if (d==7){

                posibilidades=posibilidades+("h"+cont+" ");
            }

        }

        cont=Integer.parseInt(numpos);
        //arriba derecha


        for (w=numlet+1;w<=7;w++){
            cont=cont-1;
            if (cont==0){
                break;
            }
            if (w==0){

                posibilidades=posibilidades+("a"+cont+" ");
            }
            if (w==1){

                posibilidades=posibilidades+("b"+cont+" ");
            }
            if (w==2){

                posibilidades=posibilidades+("c"+cont+" ");
            }
            if (w==3){

                posibilidades=posibilidades+("d"+cont+" ");
            }
            if (w==4){

                posibilidades=posibilidades+("e"+cont+" ");
            }
            if (w==5){

                posibilidades=posibilidades+("f"+cont+" ");
            }
            if (w==6){

                posibilidades=posibilidades+("g"+cont+" ");
            }
            if (w==7){

                posibilidades=posibilidades+("h"+cont+" ");
            }

        }

        cont=Integer.parseInt(numpos);
        //abajo izq


        for (n=numlet-1;n>=0;n--){
            cont=cont+1;
            if (cont>8){
                break;
            }
            if (n==0){

                posibilidades=posibilidades+("a"+cont+" ");
            }
            if (n==1){

                posibilidades=posibilidades+("b"+cont+" ");
            }
            if (n==2){

                posibilidades=posibilidades+("c"+cont+" ");
            }
            if (n==3){

                posibilidades=posibilidades+("d"+cont+" ");
            }
            if (n==4){

                posibilidades=posibilidades+("e"+cont+" ");
            }
            if (n==5){

                posibilidades=posibilidades+("f"+cont+" ");
            }
            if (n==6){

                posibilidades=posibilidades+("g"+cont+" ");
            }
            if (n==7){

                posibilidades=posibilidades+("h"+cont+" ");
            }
        }

        cont=Integer.parseInt(numpos);


        for (g=numlet+1;g<=7;g++){
            cont=cont+1;
            if (cont>8){
                break;
            }
            if (g==0){

                posibilidades=posibilidades+("a"+cont+" ");
            }
            if (g==1){

                posibilidades=posibilidades+("b"+cont+" ");
            }
            if (g==2){

                posibilidades=posibilidades+("c"+cont+" ");
            }
            if (g==3){

                posibilidades=posibilidades+("d"+cont+" ");
            }
            if (g==4){

                posibilidades=posibilidades+("e"+cont+" ");
            }
            if (g==5){

                posibilidades=posibilidades+("f"+cont+" ");
            }
            if (g==6){

                posibilidades=posibilidades+("g"+cont+" ");
            }
            if (g==7){

                posibilidades=posibilidades+("h"+cont+" ");
            }

        }
        System.out.println("el alfil se podra mover en las siguientes posiciones: "+ posibilidades);
    }
}


