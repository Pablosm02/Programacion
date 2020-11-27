package U3.T4;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int mesas[]=new int[10];
        int i;
        for (i=0;i<=9;i++){
            mesas[i]=(int) (Math.random()*(200-300+1)+300);
        }

        int y;
        for (y=0;y<=9;y++){
            System.out.println((y+1)+". "+mesas[y]);
        }
        System.out.println("cuantos comensales van a ser?");
        int num=sc.nextInt();
        int u;
        if (num>4){
            System.out.println("lo siento, admitimos un numero maximo de 4");
        }
        else {


            for (u = 0; u <= 9; u++) {
                if (mesas[u]+num<5){
                    System.out.println("se le colocara en la mesa numero "+(u+1));
                    break;
                }

            }
        }
    }
}
