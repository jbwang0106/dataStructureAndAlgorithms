package simplesort;

/** 插入排序
 *  适用于部分有序的数组
 *  时间复杂度为O(N^2)
 * Created by jbwang0106 on 2017/5/7.
 */
public class InsertionSort {

    public static int [] array = {23,87,45,95,34,57,61};

    public static void main(String [] args) {

        System.out.println("排序前：");
        display();
        int temp = 0;
        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            int j = i;
            while (j > 0 && array[j-1] >= temp) {
                array[j] = array[j-1]; //把前一项的值往后移，空出前一项的位置
                j--;
            }

            array[j] = temp; //在空的位置插入这个值
        }

        System.out.println("排序后: ");
        display();
    }

    public static void display() {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");

        System.out.println();
    }

}
