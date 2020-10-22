package U2.unit2.U2.T4;

import com.sun.jdi.IntegerValue;

import javax.naming.InterruptedNamingException;
import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        System.out.print("porfavor, introduzca su primera nota (numero entero))");
        Scanner sc = new Scanner(System.in);
        int primeranota = sc.nextInt();
        double primeranota2 = primeranota;
        System.out.print("porfavor, introduzca su segunda nota (numero entero)");
        int segundanota = sc.nextInt();
        double segundanota2 = segundanota;
        double media = ((primeranota2+segundanota2)/2);

        System.out.print("Su media es de " + media);
    }
}
