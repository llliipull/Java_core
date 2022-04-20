package HW3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //задание 1
        String[] arr = {"one", "two", "three", "four"};
        changeElements(arr, 3,1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //задание 2

        ArrayList<Apple> apples = new ArrayList<>();
        ArrayList<Orange> oranges = new ArrayList<>();
        ArrayList<Orange> oranges1 = new ArrayList<>();


        Box<Apple> appleBox = new Box(apples, 1.0f);
        Box<Orange> orangeBox = new Box(oranges, 1.5f);


        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());

        System.out.println(appleBox.compare(orangeBox));

        Box <Orange> emptyBox = new Box(oranges1, 1.5f);
        System.out.println(emptyBox.getWeight());
        emptyBox.changeBox(orangeBox);
        System.out.println("Вес коробки после пополнения " + orangeBox.getWeight());
        System.out.println("вес коробки после опустошения" + emptyBox.getWeight());


    }

    //метод для задания 1
    public static void changeElements(String[] arr, int element1, int element2) {
        String temp = arr[element1];
        arr[element1] = arr[element2];
        arr[element2] = temp;
    }

}
