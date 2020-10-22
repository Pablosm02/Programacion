package U2.unit2.U2.T3;
import java.util.Scanner;
public class t3ex1 {
    public static void main( String args[] ){
        Scanner sudapa = new Scanner(System.in);
        System.out.println("Introduzca el primer numero menor de 100");
        byte primernumero = sudapa.nextByte();

        System.out.println("Introduzca el segundo numero menor de 100");
        byte segundonumero = sudapa.nextByte();

        System.out.println(primernumero+segundonumero);



    }

}
