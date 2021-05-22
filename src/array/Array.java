package array;

public class Array {

    //        int[] array = {2, 3, 1, 0, 2, 5};
//        int num = main.getDuplicateNum(array);
//        System.out.println(num);

//        int[][] array = {
//                {1, 4, 7, 11, 15},
//                {2, 5, 8, 12, 19},
//                {3, 6, 9, 16, 22},
//                {10, 13, 14, 17, 24},
//                {18, 21, 23, 26, 30}
//        };
//        System.out.println(main.isFind(array, 10));

//        char[] string = new char[100];
//        string[0] = 'A';
//        string[1] = ' ';
//        string[2] = 'B';
//        char[] s = main.replace(string, 3);
//        for (char c : s)
//            System.out.print(c);

    public char[] replace(char[] string, int length) {
        int newLength = length - 1;
        // 扩容后大小
        for (int i = 0; i < length; i++) {
            if (string[i] == ' ') {
                newLength += 2;
            }
        }

        for (int i = length - 1; i >= 0; i--) {
            if (i != newLength) {
                if (string[i] != ' ') {
                    string[newLength--] = string[i];
                } else {
                    string[newLength--] = '0';
                    string[newLength--] = '2';
                    string[newLength--] = '%';
                }
            }
        }

        return string;
    }

    public boolean isFind(int[][] array, int num) {

        for (int i = array[0].length -1; i >= 0; i--) {
//            if (array[0][i] > num) {
//                continue;
//            }
            if (array[0][i] == num) {
                return true;
            }
            if (array[0][i] < num) {
                for (int j = 0; j < array.length; j++) {
//                    if (array[j][i] < num) {
//                        continue;
//                    }
                    if (array[j][i] == num) {
                        return true;
                    }
                    if (array[j][i] > num) {
                        return false;
                    }
                }
            }
        }

        return false;
    }

    public int getDuplicateNum(int[] array) {
        for (int i = 0; i < array.length; i++) {
            while (array[i] != i) { // 当前位置不等于
                if (array[i] == array[array[i]]) {
                    return array[i];
                }
                swap(array, array[i], i);
            }
        }
        return -1;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
