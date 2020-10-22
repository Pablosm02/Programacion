package U2.unit2.U2.T2;
import java.util.Scanner;

public class ex3 {

    public static void main( String args[] ) {

        Scanner dell = new Scanner (System.in);
                System.out.println(
                        "Introduzca un primer numero por favor:"
                );
        int primernumero = dell.nextInt();
        System.out.print( "Introduzca el segundo número por favor: " );
        int segundonumero = dell.nextInt();

        System.out.println(
                "Su numero es:"
        );
        System.out.println(
                primernumero/segundonumero
        );
    }
}
