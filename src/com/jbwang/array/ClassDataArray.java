package com.jbwang.array;

/** 对象的数组封装类
 * Created by jbwang0106 on 2017/5/4.
 */
public class ClassDataArray {

    private Person[] persons;
    private int nElems;

    public ClassDataArray(int size) {
        persons = new Person[size];
    }

    /**
     * 根据名称查找某个person
     * @param searchName
     * @return
     */
    public Person find(String  searchName) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (searchName.equals(persons[j].getLastName()))
                break;
        }

        if (j == nElems)
            return null;
        else
            return persons[j];

    }

    /**
     * 插入一个对象
     * @param person
     */
    public void insert(Person person) {
        persons[nElems++] = person;
    }

    /**
     * 根据名称删除一个元素
     * @param searchName
     * @return
     */
    public boolean delete(String searchName) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (searchName.equals(persons[j].getLastName()))
                break;
        }

        if (j == nElems)
            return false;
        else {
            for (int k = j; k < nElems; k++) {
                persons[k] = persons[k+1];
            }

            nElems--;

            return true;
        }

    }
    
    public void display() {
        for (int j = 0; j < nElems; j++) {
            System.out.println(persons[j].toString());
        }
    }


}
