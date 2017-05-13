package com.jbwang.link.chap05;

/**
 * Created by jbwang0106 on 2017/5/12.
 */
public class CycleLinks {

        private Link current;
        private int nItems;

        public CycleLinks() {
            current = null;
        }

        public void insert(int value) {
            Link link = new Link(value);
            if (current == null) {
                current = link;
                link.next = link;
            } else {
                link.next = current.next;
                current.next = link;
                current = link;// 插入元素，current要移动更新元素
            }
            nItems++;
        }

        public int remove() {
            // list为空是没有考虑，在调用remove之前应该判断是否为空
            if (isEmpty())
                return 0;
            int temp = current.next.data;// 删掉current的下一个元素
            if (current.next == current) { // 只有一个元素时
                current = null;
            } else {
                current.next = current.next.next;
            }
            nItems--;
            return temp;
        }

        public int peek() { // 返回最早插入的元素
            // 调用前要判断是否为空
            return current.next.data;
        }

        public Link find(int value) {
            Link temp = current; // 保存原来的位置
            Link result = null;
            if (current == null) {
                return result;
            }
            do {
                step(); // 从current的下一个元素开始比较
                if (current.data == value) {
                    result = current;
                    current = temp; // 还原current到原来的位置,这样就不会打乱插入的顺序，current指向最后插入的元素
                    return result;
                }
            } while (current != temp); // current到达原来的位置,一周循环结束
            return result;
        }

        // 往下移一步
        public void step() { // 调用step()方法后，顺序会被打乱
            if (current != null) {
                current = current.next;
            }
        }

        public void display() {
            if (current != null) {
                Link temp = current;
                do {
                    step(); // 从current的一下个开始显示
                    System.out.print(current.data + " ");
                } while (current != temp);
            }
            System.out.println();
        }

        public boolean isEmpty() {
            return current == null;
        }

        public int size() {
            return nItems;
        }

        public static void main(String [] args) {

            CycleLinks cycleLinks = new CycleLinks();
            cycleLinks.insert(11);
            cycleLinks.insert(22);
            cycleLinks.insert(33);
            cycleLinks.insert(44);
            cycleLinks.insert(55);
            cycleLinks.insert(66);

            cycleLinks.display();

            System.out.println(cycleLinks.peek());

            cycleLinks.remove();

            cycleLinks.display();
            cycleLinks.step();
            cycleLinks.remove();

            cycleLinks.display();

        }

}

