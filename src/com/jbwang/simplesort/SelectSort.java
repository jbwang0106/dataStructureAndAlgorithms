package simplesort;

/**选选择排序算法
 * 在未排序序列中找到最小元素，存放到排序序列的起始位置
 * 再从剩余未排序元素中继续寻找最小元素，然后放到排序序列末尾。
 * 以此类推，直到所有元素均排序完毕。
 * 时间复杂度为O(N^2)
 * Created by jbwang0106 on 2017/5/7.
 */
public class SelectSort {

    public static int [] array = {23,87,45,95,34,57,61};

    public static void main(String [] args) {

        System.out.println("排序前：");
        display();
        int temp = 0; //临时变量
        int min = 0;  //最小值的位置
        for (int i = 0; i < array.length-1; i++) { //外层循环控制比较的轮数
            min = i;
            for (int j = i + 1; j < array.length-1; j++) { //内层循环控制每轮比较的次数
                if(array[min] > array[j]) {
                    min = j;
                }
            }

            temp = array[i];
            array[i] = array[min];
            array[min] = temp;
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
