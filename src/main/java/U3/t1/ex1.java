package U3.t1;

public class ex1 {
    public static void main(String[] args) {
        //Actividad 1: Diseñar una función eco() a la que se le pasa como parámetro un número n, y muestra por pantalla n veces el mensaje "Eco..."
        int n= 4;

        System.out.println(function1(n));

    }


public static String function1 (int a) {
    int i;
    for (i = 1; i < a ; i++) {
        System.out.println("eco");
    }
    return "eco";
}





}