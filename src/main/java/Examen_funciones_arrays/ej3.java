package Examen_funciones_arrays;

public class ej3 {
    public static void main(String[] args) {

        int array[]= new int [10];
        String s="";
        for (int j = 0; j<10; j++) {
            array[j] = (int) (Math.random() * (1000 - 100 + 1) + 100);

        }
        for (int i = 0; i < array.length; i++) {
            s=s+array[i]+",";

        }
        System.out.println(s);

        for (int i=0; i<9;i++){
            if (filtracon4(array)[i]==0){
                continue;
            }
            System.out.println(filtracon4(array)[i]);
        }



    }
    public static int[] filtracon4 (int x[]){
    boolean boo=false;
        int conta=0;
        String array2[] = new String[10];
        int arrayaux[]=new int [x.length];
        for (int i = 0; i < x.length; i++) {
            array2[i]=(x[i]+"");

            for (int j = 0; j < array2[i].length(); j++) {
                if (array2[i].charAt(j)=='4'){
                    arrayaux[conta]=x[i];
                    conta=conta+1;
break;
                }

            }
        }
        for (int i = 0; i < x.length; i++) {
            if (arrayaux[i]!=0){
                boo=true;
            }
        }
        if (boo=false){
            int mal[]=new int[1];
            mal[0]=-1;
            return mal;
        }
        else{
            return arrayaux;
        }



    }
}
