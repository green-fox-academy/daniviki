package greenfox;

public class Person {
    String name;
    int age;
    String gender;


    public Person (String name, int age, String gender) {

        this.name = name;
        this.age = age;
        this.gender = gender;

    }
    public Person () {
        name = "jane Doe";
        age = 30;
        gender = "female";
    }
    static void introduce(String name, int age, String gender) {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + ".");
    }
    static void getGoal() {
        System.out.println("My goal is: Live for the moment!");
    }


}
