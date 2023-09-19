package ru.geekbrains.lesson4.homework;

import java.util.ArrayList;

public class Box<T extends Fruct> {

    private ArrayList<T> fructs;

    public Box(ArrayList<T> fructs) {
        this.fructs = fructs;
    }

    public void add(T fruct){
        fructs.add(fruct);
    }

    public float getWeight(){
        float weight = 0f;

        for (T fruit: fructs) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compare (Box another){
        return getWeight() > another.getWeight();
    }

    public void emptyBox(Box<T> another) {
        if (isProductsComparable(another)) {
            for (T fruct : fructs) {
                another.add(fruct);
            }
            fructs.clear();
        }
    }

    public ArrayList<T> getProduct() {
        return fructs;
    }
    public boolean isProductsComparable(Box otherBox) {
        return fructs.get(0).getClass() == otherBox.getProduct().get(0).getClass();
    }
}
