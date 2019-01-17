public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables
        int dayHours = 23;
        int dayMinutes = 59;
        int daySeconds = 60;

        int remainingHours = dayHours - currentHours;
        int remainingMinutes = dayMinutes - currentMinutes;
        int remainingSeconds = daySeconds - currentSeconds;

        System.out.println( "Reamining: " +(remainingHours) + " hours " + (remainingMinutes) + " minutes " + (remainingSeconds) + " seconds." );



    }
}