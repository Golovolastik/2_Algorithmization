package multiDimArr;

// Дана матрица.
// Вывести на экран все нечетные столбцы,
// у которых первый элемент больше последнего.
public class Task1 {
    public static void main(String[] args){
        final int SIZE = 5;
        int[][] array = new int[SIZE][SIZE];
        MultiDimArr.initTwoDInt(array, SIZE, SIZE);
        MultiDimArr.printTwoDInt(array, SIZE, SIZE);
    }
}
