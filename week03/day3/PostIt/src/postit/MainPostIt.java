package postit;

public class MainPostIt {
    public static void main(String[] args) {
        PostIt number1 = new PostIt("Orange", "Idea 1"  , "Blue");
        number1.printPostIt();
        PostIt number2 = new PostIt("Pink", "Awesome!", "Black");
        number2.printPostIt();
        PostIt number3 = new PostIt("Yellow", "Superb!", "Green");
        number3.printPostIt();
    }
}


