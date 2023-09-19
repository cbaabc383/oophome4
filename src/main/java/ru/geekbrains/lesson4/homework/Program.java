package ru.geekbrains.lesson4.homework;

import java.util.ArrayList;

public class Program {

    /*
    a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
c. Для хранения фруктов внутри коробки можно использовать ArrayList;
d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
Можно сравнивать коробки с яблоками и апельсинами;
f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
g. Не забываем про метод добавления фрукта в коробку.

Формат сдачи: ссылка на гитхаб проект
    * */
    public static void main(String[] args) {
        ArrayList<Apple> fructs1 = new ArrayList<>();
        fructs1.add(new Apple());
        fructs1.add(new Apple());
        fructs1.add(new Apple());
        fructs1.add(new Apple());
        fructs1.add(new Apple());
        fructs1.add(new Apple());

        ArrayList<Orange> fructs2 = new ArrayList<>();
        fructs2.add(new Orange());
        fructs2.add(new Orange());
        fructs2.add(new Orange());
        fructs2.add(new Orange());
        fructs2.add(new Orange());
        fructs2.add(new Orange());
        fructs2.add(new Orange());
        fructs2.add(new Orange());
        fructs2.add(new Orange());



        System.out.println(fructs1.size());
        System.out.println(fructs2.size());

        Box box1 = new Box(fructs1);
        System.out.println(box1.getClass());
        Box box2 = new Box<>(fructs2);
//        box1.add(new Apple());
//        box1.add(new Orange());
        System.out.println(box1);

        System.out.println(box1.getWeight());
        System.out.println(box2.getWeight());

        System.out.println(box1.compare(box2));
        System.out.println(box2.compare(box1));



        System.out.println(box1.isProductsComparable(box2));

        box1.emptyBox(box2);
        System.out.println(box1.getWeight());
        System.out.println(box2.getWeight());


    }

}
