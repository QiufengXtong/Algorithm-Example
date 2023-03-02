package sort;

import java.util.Arrays;

/**
 * 选择排序
 */
public class SelectSort {

    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i+1; j < array.length - i - 1; j++) {
                if (array[min] > array[j]){
                    min = j;
                }
            }
            int tmp = array[i];
            array[i] = array[min];
            array[min] = tmp;
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
