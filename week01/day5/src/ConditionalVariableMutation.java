public class ConditionalVariableMutation {
    public static void main(String[] args) {
        double a = 24;
        int out = 0;
        // if a is even increment out by one

        if (a % 2 == 0) {
            System.out.println(++a);
        }else{
            System.out.println(out);
        }




        int b = 13;
        String out2 = "";
        // if b is between 10 and 20 set out2 to "Sweet!"
        // if less than 10 set out2 to "Less!",
        // if more than 20 set out2 to "More!"
        if (b < 20 && b > 10) {
            System.out.println(out2 = "Sweet!");
        }else if (b <10) {
            System.out.println(out2 = "Less!");
        }else {
            System.out.println(out2 = "More!");
        }



        int c = 123;
        int credits = 100;
        boolean isBonus = false;
        // if credits are at least 50,
        // and isBonus is false decrement c by 2
        // if credits are smaller than 50,
        // and isBonus is false decrement c by 1
        // if isBonus is true c should remain the same
        if (credits >= 50 && isBonus == false) {
            System.out.println(c - 2);
        }else if (isBonus == true) {
            System.out.println(c);
        }else {
            System.out.println(c - 1);
        }



        int d = 8;
        int time = 120;
        String out3 = "";
        // if d is dividable by 4
        // and time is not more than 200
        // set out3 to "check"
        // if time is more than 200
        // set out3 to "Time out"
        // otherwise set out3 to "Run Forest Run!"
        if (d % 4 ==0 && time <= 200) {
            System.out.println(out3 = "check");
        }else if (time > 200)
            System.out.println(out3 = "Time out");
        else {
            System.out.println(out3 = "Run Forest Run!");
        }
    }
}