package U3.T3;

public class exarrays {
    public static void main(String[] args) {
        int array2[][]=new int [6][10];
        int i;
        int t;
        for (t=0;t<6;t++) {
            for (i = 0; i < 10; i++) {
                array2[t][i] = (int) (Math.random() * 1000);


            }
        }
        int j;
        int k;
        for (j=0;j<6;j++){
            for (k=0;k<10;k++){
                System.out.println(array2[j][k]);
            }
        }
    }
}
