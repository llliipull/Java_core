package HW1;

public class People {

    private String name;
    private int age;
    private int weight;
    private int jumpDistance;
    private int runDistance;
    private int swimDistance;
    private int count;


    public People(String name, int age, int weight, int jumpDistance, int runDistance, int swimDistance){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.jumpDistance = jumpDistance;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
    }



    public String getName(){
        return this.name;
    }

    public int getWeight(){
        return this.weight;
    }

    public int getAge(){
        return this.age;
    }

    public int getJumpDistance(){
        return this.jumpDistance;
    }

    public int getRunDistance(){
        return this.runDistance;
    }

    public int getSwimDistance(){
        return this.swimDistance;
    }



}
