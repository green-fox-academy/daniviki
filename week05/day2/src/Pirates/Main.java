package Pirates;

public class Main {
    public static void main(String[] args) {
        Pirate pirate1 = new Pirate("Jack", true, false);
        Pirate pirate2 = new Pirate("Barbossa", true, true);
        Pirate pirate3 = new Pirate("William", false, false);
        Pirate pirate4 = new Pirate("Lakatos Riodezsanéró", false, true);

        Ship ship1 = new Ship("Black Pearl");

        pirate1.introduce();
        pirate2.work();
        pirate3.party();
        pirate4.introduce();

        ship1.getPoorPirates();

    }
}
