package U2.unit2.U2.T3;

import java.util.Scanner;

public class T3EX4 {
    public static void main(String[] args) {
        System.out.println("Por favor, introduza la cantidad de millas que desea pasar a metros.");
        Scanner sc = new Scanner(System.in);
        Integer Millas = sc.nextInt();
        System.out.println(Millas*1.609 + " km");
    }
}
