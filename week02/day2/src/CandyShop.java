import java.util.*;

public class CandyShop {
    public static void main(String... args){
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("Cupcake");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);

        // Accidentally we added "2" and "false" to the list.
        // Your task is to change from "2" to "Croissant" and change from "false" to "Ice cream"
        // No, don't just remove the lines
        // Create a method called sweets() which takes the list as a parameter.

        System.out.println(sweets(arrayList));
        // Expected output: "Cupcake", "Croissant", "Brownie", "Ice cream"
    }
    public static ArrayList<Object> sweets(ArrayList<Object> arrayList) {
        ArrayList<Object> newList = new ArrayList<Object>();

        for( int i = 0; i < newList.size(); i++ ) {
            if (newList.get(i).equals(2)) {
                newList.set(i, "Croissant");
            }else if (newList.get(i).equals(false);
                newList.set(i,"Ice Cream");

        }

        //arrayList.set(1, "Croissant");
        //arrayList.set(3, "Ice Cream");


        return arrayList;
    }
}