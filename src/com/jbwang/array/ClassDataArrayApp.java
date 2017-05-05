package com.jbwang.array;

/**
 * 测试classDataArray
 * Created by jbwang0106 on 2017/5/4.
 */
public class ClassDataArrayApp {

    public static void main(String [] args) {
        ClassDataArray persons = new ClassDataArray(100);
        persons.insert(new Person("11","11",11));
        persons.insert(new Person("33","33",33));
        persons.insert(new Person("55","55",55));
        persons.insert(new Person("77","77",77));
        persons.insert(new Person("99","99",99));
        persons.insert(new Person("00","00",00));
        persons.insert(new Person("88","88",88));
        persons.insert(new Person("66","66",66));
        persons.insert(new Person("44","44",44));
        persons.insert(new Person("22","22",22));
        
        //遍历
        persons.display();
        
        //查找
        Person person = persons.find("44");
        if(person != null)
            System.out.println(person.toString());
        else
            System.out.println("未找到person");

        //删除
        persons.delete("44");

        //查找
        person = persons.find("44");
        if(person != null)
            System.out.println(person.toString());
        else
            System.out.println("未找到person");

        //遍历
        persons.display();
        
    }
}
