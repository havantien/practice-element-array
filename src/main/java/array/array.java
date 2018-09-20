package array;


import java.util.Scanner;

public class array {

    /**
     * sắp xếp mảng số nguyên theo thứ tự tăng dần
     *
     * @param array: mảng các số nguyên
     */
    public static void sortASC(int [] array){
        int temp = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; i++) {
                if (array[i] > array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }

    /**
     * chèn phần tử vào mảng số nguyên tăng dần
     * sau khi chèn mảng vẫn duy trì thứ tự tăng dần
     *
     * @param array: mảng số nguyên tăng dần
     * @param k: phần tử chèn vào mảng arr
     */

    public static int[] insert(int[] array, int k){
        int arrayIndex = array.length - 1;
        int tempIndex = array.length;
        int [] tempArr = new int[tempIndex + 1];
        boolean inserted = false;

        for (int i = tempIndex; i >=0; i--) {
            if (arrayIndex > -1 && array[arrayIndex] > k) {
                tempArr[i] = array[arrayIndex --];
            } else {
                if (!inserted) {
                    tempArr[i] = k;
                    inserted = true;
                } else {
                    tempArr[i] = array[arrayIndex--];
                }
            }
        }
        return tempArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        // khởi tạo array];
        int [] array = new int[n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            array[i] = sc.nextInt();
        }
        System.out.print("Nhập phần tử k = ");
        int k = sc.nextInt();
        // sắp xếp dãy số theo thứ tự tăng dần
        sortASC(array);
        System.out.print("Sắp xếp mảng tăng dần: ");
        show(array);
        System.out.printf("\nChèn phần tử %d vào mảng.", k);
        array = insert(array, k);
        System.out.print("\nMảng sau khi chèn: ");
        show(array);
    }

    public static void show(int [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
