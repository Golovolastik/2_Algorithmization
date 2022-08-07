package multiDimArr;

// Дана матрица. Вывести k-ю строку и p-й cтолбец.
public class Task3 {
    public static void main(String[] args){
        final int ROW = 4;
        final int COLUMN = 6;
        int[][] array = new int[ROW][COLUMN];
        MultiDimArr.initTwoDInt(array, ROW, COLUMN);
        MultiDimArr.printTwoDInt(array, ROW, COLUMN);
    }
}
