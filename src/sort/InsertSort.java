package sort;

import java.util.Arrays;

/**
 * 插入排序
 */
public class InsertSort {

    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 5, 7, 2, 4, 6, 8};
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println("排序前：" + Arrays.toString(array));
        bubbleSort.sort(array);
        System.out.println("排序后：" + Arrays.toString(array));
    }
}
