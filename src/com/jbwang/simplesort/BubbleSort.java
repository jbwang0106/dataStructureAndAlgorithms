package simplesort;

/**
 * 冒泡排序
 * 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
 * 针对所有的元素重复以上的步骤，除了最后一个。
 * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 * 时间复杂度为O(N^2)
 *
 * Created by jbwang0106 on 2017/5/7.
 */
public class BubbleSort {

    public static int [] array = {23,87,45,95,34,57,61};

    public static void main(String [] args) {
        System.out.println("排序前:");
        display();
        int temp = 0;
        for (int i = 0; i < array.length -1; i++) { //外层循环控制比较的轮数
            for (int j = 0; j < array.length -1-i; j++) { //内层循环控制每轮需要比较的次数
                if(array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        System.out.println("排序后:");
        display();

    }
    
    public static void display() {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        
        System.out.println();
    }
}
