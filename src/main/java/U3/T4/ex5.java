package U3.T4;
import java.lang.Math;
import java.util.Random;

public class ex5 {
    public static void main(String[] args) {
        int array[][] = new int[10][10];
        int i;
        int t;

        for (i = 0; i <= 9; i++) {
            for (t = 0; t <= 9; t++) {
                Random valor=new Random();
                int value=(int)Math.floor(Math.random()*(200-301+1)+301);
                array[i][t]=value;
            }

        }

        int h;
        int g;
        int num=0;
    for (h=0;h<=9;h++){
        for (g=0;g<=9;g++){
            System.out.println(num+". "+array[h][g]);
            num=num+1;
        }
    }
        int cont=0;
        int d;
        int l;
        int suma=0;
        int max=0;
        int min=1000;
        int media;

        for (d=0;d<=9;d++){

                System.out.println(array[d][cont]);


                suma=suma+array[d][cont];
                if (max<array[d][cont]){
                    max=array[d][cont];
                }
                if (min>array[d][cont]){
                min=array[d][cont];
                 }
            cont=cont+1;


        }
        media=suma/10;
        System.out.println("la media de la diagonale es: "+media);
        System.out.println("el maximo es "+max);
        System.out.println("el minimo es "+min);

    }
}
