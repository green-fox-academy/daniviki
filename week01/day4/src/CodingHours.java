public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

        float percentage;
        float weeklyAverage = 52 * 17;
        float codingHours = 6 * 5 * 17;

        percentage = 100 / weeklyAverage;
        System.out.println(percentage * codingHours + " is the coding hours in the semester");





    }
}