package HW3;

import java.util.ArrayList;

public class Box <T extends Fruit>{

    private ArrayList<T> fruits;
    private float weight;
    private float boxWeight;


    public Box (ArrayList<T> fruits, float weight){
        this.fruits = fruits;
        this.weight = weight;
        for (int i = 0; i < 8; i++) {
            fruits.add(i, (T) new Fruit());
        }
    }


    public float getWeight () {
        return fruits.size() * this.weight;
    }


    public boolean compare(Box box){
        return this.getWeight() == box.getWeight();
    }

    public int boxSize(){
        return this.fruits.size();
    }

    public void boxAdd(ArrayList<T> fruits){
        for (int i = 0; i < fruits.size(); i++) {
            fruits.add(i, (T) new Fruit());
        }
    }


    public void changeBox(Box<T> box){

        box.fruits.addAll(fruits);
        this.fruits.clear();



    }

}
