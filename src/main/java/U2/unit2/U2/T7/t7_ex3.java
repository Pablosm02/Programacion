package U2.unit2.U2.T7;
import com.sun.jdi.IntegerValue;
import java.util.Random;
import java.lang.*;
public class t7_ex3 {
    public static void main(String[] args) {
        String s1= "abcdefghijklmnopqrstuvwxyz";
        Double valorDado = Math.random()*26;
        Integer valor = valorDado.intValue();
        Character c1 = s1.charAt(valor); // 0-25
        System.out.println("su letra es la " + c1);



    }
}
