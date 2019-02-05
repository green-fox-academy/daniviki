package aircraftcarrier;

public class Main {
    public static void main(String[] args) {
        Aircraft viki = new F35();
        viki.getStatus();
        Aircraft levi = new F16();
        levi.getStatus();
    }
}
