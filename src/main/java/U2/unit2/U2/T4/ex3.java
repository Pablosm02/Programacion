package U2.unit2.U2.T4;




import java.util.Scanner;

    public class ex3 {
        public static void main(String[] args) {
            System.out.print("porfavor, introduzca su primera nota (numero entero))");
            Scanner sc = new Scanner(System.in);
            double primeranota = sc.nextDouble();

            System.out.print("porfavor, introduzca su segunda nota (numero entero)");
            double segundanota = sc.nextDouble();

            System.out.print("porfavor, introduzca su tercera nota (numero entero)");
            double terceranota = sc.nextDouble();

            double media = ((primeranota+segundanota+terceranota)/3);
            int media2 = Integer.valueOf((int) media);

            System.out.print("Su media es de " + media2);
        }
    }

