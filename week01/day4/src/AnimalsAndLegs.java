import java.util.Scanner;
public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add the number of the chickens: "); // 2 lábuk van
        int addedChickens = scanner.nextInt();

        System.out.println("Add the number of the pigs: "); // 4 lábuk van :)
        int addedPigs = scanner.nextInt();
        System.out.println("They have " + (addedChickens *2 + addedPigs *4) + " legs all together.");

        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
    }
}