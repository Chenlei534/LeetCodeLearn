package array;

import utils.OutputUtilsKt;

/**
 * 几种主要的排序方式：
 * <p>
 * 冒泡排序
 * <p>
 * 选择排序
 * <p>
 * 插入排序
 * <p>
 * 快速排序
 */
public class Sort {

    /**
     * 交换数组中两数位置
     *
     * @param array 待交换数组
     * @param i 数字位置
     * @param j 数字位置
     */
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * 冒泡排序
     *
     * @param array 待排序数组
     */
    public void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
        OutputUtilsKt.printlnArray(array);
    }

    /**
     * 选择排序
     *
     * @param array 待排序数组
     */
    public void selectSort(int[] array) {
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                swap(array, i, minIndex);
            }
        }
        OutputUtilsKt.printlnArray(array);
    }

    /**
     * 插入排序
     *
     * @param array 待排序数组
     */
    public void insertSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int index = i;
            for (int j = i - 1; j >= 0; j--) {
                if (array[j] > array[index]) {
                    // 从小到大排序，如果前边得数字大于后边的数字，则开始搞事情，交换两个数字位置
                    swap(array, j, index);
                    index = j;
                    OutputUtilsKt.printArray(array);
                }
            }
        }
        OutputUtilsKt.printlnArray(array);
    }

    /**
     * 快速排序
     *
     * @param array 待排序数组
     */
    public void quickSort(int[] array) {

        quickSort(array, 0, array.length - 1);

        OutputUtilsKt.printArray(array);
    }

    private void quickSort(int[] array, int left, int right) {
        if (left > right) {
            return;
        }

        int index = quickSortIndex(array, left, right);
        quickSort(array, left, index - 1);
        quickSort(array, index + 1, right);
    }

    private int quickSortIndex(int[] array, int left, int right) {
        int start = left;
        int end = right;
        int key = array[start];

        while (start < end) {
            while (start < end && array[end] > key) {
                end--;
            }
            if (start < end) {
                array[start] = array[end];
            }
            while (start < end && array[start] <= key) {
                start++;
            }
            if (start < end) {
                array[end] = array[start];
            }
        }
        array[end] = key;
        return end;
    }
}
