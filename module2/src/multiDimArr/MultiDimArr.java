package multiDimArr;

import java.util.Random;

public class MultiDimArr {
    static void initTwoDInt(int arr[][], int columnNumber, int rowNumber){
        Random random = new Random();
        for (int i=0; i<rowNumber; i++){
            for (int j=0; j<columnNumber; j++){
                arr[i][j] = random.nextInt() % 100;
            }
        }
    }

    static void printTwoDInt(int arr[][], int columnNumber, int rowNumber){
        Random random = new Random();
        for (int i=0; i<rowNumber; i++){
            for (int j=0; j<columnNumber; j++){
                System.out.printf("%4d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
