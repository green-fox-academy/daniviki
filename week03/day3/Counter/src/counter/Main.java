package counter;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        counter.get();
        counter.add(14);
        counter.add();
        counter.get();
        counter.reset();
        counter.add(47);
        counter.get();

    }
}
