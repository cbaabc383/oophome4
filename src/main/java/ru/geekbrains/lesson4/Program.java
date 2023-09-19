package ru.geekbrains.lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(new Employee("AAAA", 24));
        arrayList1.add(true);
        arrayList1.add(12);
        arrayList1.add("hello");

        MyArrayList<Employee> myArrayList = new MyArrayList<>(new Employee[10]);
        myArrayList.add(new Employee("AAAA", 24));

        System.out.println("Кол-во элементов коллекции: " + myArrayList.size());

        for (Employee e: myArrayList) {
            if (e != null){
                System.out.println(e.getName());
            }

        }

        Integer[] array1 = new Integer[] { 5, 6, -1, 12, 1 };
        String[] array2 = new String[] { "AA", "BB", "CC", "DD" };
        System.out.println(Arrays.toString(array1));
        Integer[] res = ArrayUtils.replaceTwoElements(array1, 1, 2);
        System.out.println(Arrays.toString(res));
    }

}
