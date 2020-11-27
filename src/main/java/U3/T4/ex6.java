package U3.T4;

public class ex6 {
    public static void main(String[] args) {
        int array[][]=new int [6][10];
        int i;
        int j;
        int minx=0;
        int miny=0;
        int maxx=0;
        int maxy=0;
        int max=0;
        int min=100;
        for (i=0;i<=5;i++){
            for (j=0;j<=9;j++){
                array[i][j]=(int) Math.floor(Math.random()*(0-1000+1)+1000);
                if (min>array[i][j]){
                    minx=i;
                    miny=j;
                    min=array[i][j];
                }
                if (max<array[i][j]){
                    maxx=i;
                    maxy=j;
                    max=array[i][j];
                }
            }
        }
        int h;
        int g;
        for (h=0;h<=5;h++){
            for (g=0;g<=9;g++){
                System.out.println(h+""+g+" "+array[h][g]);
            }
        }
        System.out.println("la posicion del maximo es "+(maxx)+(maxy));
        System.out.println("la posicion del min es "+minx+" "+(miny));
    }
}
