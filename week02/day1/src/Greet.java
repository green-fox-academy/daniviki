public class Greet {
    public static void main(String[] args) {
        String al = "Greenfox";
        al = greet(al);
        System.out.println("Hali, " + al);

    }
    public static String greet(String name){
        return name;
    }
}
//  From now on, create the usual class wrapper
//  and main method on your own.

// - Create a string variable named `al` and assign the value `Greenfox` to it
// - Create a function called `greet` that greets it's input parameter
//     - Greeting is printing e.g. `Greetings dear, Greenfox`
// - Greet `al`