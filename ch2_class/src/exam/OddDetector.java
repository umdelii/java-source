package exam;

public abstract class OddDetector {
    public abstract boolean isOdd();

    private int n;

    public OddDetector(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }
}
