package Examen_funciones_arrays;

import java.util.Arrays;

public class ej2 {
    public static void main(String[] args) {


    int array[][] = new int[5][9];
    int num;
    int max=0;
    int min=1001;
    int j;
        for (int i = 0; i<array.length; i++) {
            for (j = 0; j<9; j++) {
                num = (int) (Math.random() * (1000 - 100 + 1) + 100);
                while (sinrepetidos(num, array)){
                    System.out.println(num);
                    num=(int)(Math.random()*(1000-0+1)+0);
                }
                array[i][j]=num;
                if (array[i][j]>max){
                    max=array[i][j];
                }
                if (array[i][j]<min){
                    min=array[i][j];
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(Arrays.toString(array[i]) + " ");
            System.out.println();
        }
        System.out.println("el maximo es "+max);
        System.out.println("el minimo es "+ min);
    }
    public static boolean sinrepetidos(int num, int array[][]){
        for (int i = 0; i < array.length; i++) {
            for (int j=0;j<9;j++){
                if (num==array[i][j]){
                    return true;
                }
            }
        }
        return false;

    }
}
