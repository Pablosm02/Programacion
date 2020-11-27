package U3.T4;
import java.lang.Math;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        int array[][] = new int[10][10];
        int i;
        int j;
        boolean boo = false;
        int k;
        int l;
        int min = 600;

        int max = 501;
        int num;
        for (i = 0; i <= 9; i++) {
            for (j = 0; j <= 9; j++) {
                array[i][j] = (int) Math.floor(Math.random() * (0 - 500 + 1) + 500);
                for (l = 0; i <= i - 1; l++) {
                    for (k = 0; k <= j - 1; k++) {
                        if (array[i][j] == array[l][k]) {
                            boo = true;
                        }
                    }
                }
                while (boo == true) {
                    array[i][j] = (int) Math.random() * 100;
                }
                if (array[i][j]<min ) {
                    min = array[i][j];
                }
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        int h;
        int g;
        for (h = 0; h <= 9; h++) {
            for (g = 0; g <= 9; g++) {
                System.out.println(array[h][g]);
            }
        }
        System.out.println("introduzca 1 si quiere el minimo, 2 si quiere el maximo");
        Scanner sc = new Scanner(System.in);
        int decision = sc.nextInt();
        while ((decision != 2) && (decision != 1)) {
            System.out.println("introduzca 1 si quiere el minimo, 2 si quiere el maximo");
            decision = sc.nextInt();
        }
        if (decision == 1) {
            System.out.println("el numero maximo es: " + max);
        }
        if (decision == 2) {
            System.out.println("el numero minimo es: " + min);
        }
    }
}
