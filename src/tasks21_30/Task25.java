package tasks21_30;

import java.util.Scanner;
public class Task25 {
    public static void main(String[] args) {

        int n = new Scanner(System.in).nextInt();
        int[][] array = new int[n][n];
        oddMagic(n,array);
        printSquare(array);

    }
    public static void oddMagic(int n,int array[][]){
        int i = 0;
        int j = n/2;
        for (int k = 1; k <= n*n; k++) {
            array[i][j] = k;
            if (k%n==0) {  // Если текущее число кратно n, спускаемся вниз
                i++;
            }else{  // Если текущее число не кратно n, идем вверх влево
                i--;
                j++;
                if (i<0) i=n-1;
                if (j>n-1) j=0;
            }
        }
    }

    public static void printSquare(int array[][]){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%4d",array[i][j]);
            }
            System.out.println();
        }
    }

}
