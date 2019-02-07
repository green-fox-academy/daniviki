package sharpie;

import sharpie.Sharpie;

public class Main {
    public static void main(String[] args) {
        Sharpie sharpie1 = new Sharpie("orange", 1.5f );

        System.out.println(sharpie1.color);
        sharpie1.use();
        System.out.println(sharpie1.inkAmount);

    }
}
