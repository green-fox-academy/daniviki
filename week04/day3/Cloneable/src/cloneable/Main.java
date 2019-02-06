package cloneable;

public class Main {
    public static void main(String[] args) {
        Student John = new Student("John", 20, "male", "BME");
        Student johnTheClone = John.clone();
        johnTheClone.introduce();
    }
}
