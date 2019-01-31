package animal;


public class Animal {
    /*Create an Animal class
    Every animal has a hunger value, which is a whole number
    Every animal has a thirst value, which is a whole number
    when creating a new animal object these values are created with the default 50 value
    Every animal can eat() which decreases their hunger by one
    Every animal can drink() which decreases their thirst by one
    Every animal can play() which increases both by one*/
    String name;
    int hunger;
    int thirst;


    public Animal (String name){

        this.name = name;
        hunger = 50;
        thirst = 50;
    }
    public void eat (){
        hunger--;
    }
    public void drink () {
        thirst--;
    }
    public void play () {
        hunger++;
        thirst++;
    }
    public void stats () {
        System.out.println(name + "'s statistics:" + "\n Hunger: " + hunger + "\n Thirst: " + thirst);
    }

}

