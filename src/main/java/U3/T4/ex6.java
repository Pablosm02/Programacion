package U3.T4;

import java.util.Arrays;

public class ex6 {
    public static void main(String[] args) {
        int array[][] = new int[6][10];
        int num;
        int j;
        for (int i = 0; i<array.length; i++) {
            for (j = 0; j<10; j++) {
                num = (int) (Math.random() * (1000 - 0 + 1) + 0);
                while (sinrepetidos(num, array)){
                    System.out.println(num);
                    num=(int)(Math.random()*(1000-0+1)+0);
            }
            array[i][j]=num;
            }
        }
        for (int i = 0; i < 6; i++) {
            System.out.print(Arrays.toString(array[i]) + " ");
            System.out.println();
        }
    }

    public static boolean sinrepetidos(int num, int array[][]){
        for (int i = 0; i < array.length; i++) {
            for (int j=0;j<10;j++){
                if (num==array[i][j]){
                    return true;
                }
            }
        }
        return false;

    }
}

