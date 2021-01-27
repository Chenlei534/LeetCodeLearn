import utils.OutputUtilsKt;

public class Temp {

    public int[][] getTestData(int arraySize) {
        int min = 0;
        int max = 99;
        int[][] array= new int[5][5];

        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j <= i; j++) {
                array[i][j] = OutputUtilsKt.getRandomNum(min, max);
            }
        }

        return array;
    }
}
