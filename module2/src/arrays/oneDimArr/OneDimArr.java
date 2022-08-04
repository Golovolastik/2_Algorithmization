package arrays.oneDimArr;

import java.util.Random;

public class OneDimArr {
    static void create(int[] arr, int size){
        Random random = new Random();
        for (int i=0; i<size; i++){
            arr[i] = random.nextInt() % 100;
        }
    }
    static void print(int[] arr, int size){
        for (int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }
}
