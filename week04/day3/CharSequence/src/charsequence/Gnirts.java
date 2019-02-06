package charsequence;

public class Gnirts implements CharSequence {
    String string;

    public Gnirts (String string) {
        string = string;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {

        for( int i = string.length() -2; i > 0; i++ ) {

        }

        return 0;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
