package arrays.oneDimArr;

import java.util.Random;

public class OneDimArr {
    static void initInt(int[] arr, int size){
        Random random = new Random();
        for (int i=0; i<size; i++){
            arr[i] = random.nextInt() % 100;
        }
    }
    static void initDouble(double[] arr, int size){
        Random random = new Random();
        for (int i=0; i<size; i++){
            arr[i] = (-0.5 + random.nextDouble()) * 10;
        }
    }
    static void printInt(int[] arr, int size){
        for (int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }
    static void printDouble(double[] arr, int size){
        for (int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }
}
