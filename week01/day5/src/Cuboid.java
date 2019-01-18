public class Cuboid {
    public static void main(String[] args) {

        double aSide = 10;
        double bSide = 10;
        double cSide = 10;

        System.out.println("Surface Area: " + (2 * (Math.pow(aSide,2)) + Math.pow(bSide,2)) +  Math.pow(cSide,2));
        System.out.println("Volume: " + (int) (aSide * bSide * cSide));
    }


    // Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000

}