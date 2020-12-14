package Examen_funciones_arrays;
//Define la función convierteStringEnArray con la siguiente cabecera:
//public static int[] convierteArrayEnString(String a)
//Esta función toma como parámetro un String que solamente contiene números y
// devuelve una array con las cifras que contiene el número. Por ejemplo,
// si a = "", convierteStringEnArray(a) devuelve un array sin elementos;
// si a = "8", convierteStringEnArray(a) devuelve un array con el número 8;
// a = "62501", convierteStringEnArray(a) devuelve un array tal como { 6, 2, 5, 0, 1 }.
public class ej4 {
    public static void main(String[] args) {
        String s="";
        int i= (int) (Math.random() * (1000 - 100 + 1) + 100);
        System.out.println(i);
        s=i+"";
        for (int j = 0; j < s.length(); j++) {
            System.out.println(convierteArrayEnString(s)[j]);
        }

    }
    public static int[] convierteArrayEnString(String a){
        int array[]=new int [a.length()];
        String f="";
        for (int i = 0; i < a.length(); i++) {
            f=f+a.charAt(i);
             array[i] = Integer.parseInt(f);
            f="";
        }
       return array;
    }
}
