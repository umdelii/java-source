package exam;

public abstract class Calc {
    // public abstract int num(int a, int b);

    // void setValue() {
    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Input Number1 : " + Integer.parseInt(scanner.nextLine()));
    // System.out.print("Input Number2 : " + Integer.parseInt(scanner.nextLine()));
    // System.out.println("Input operator : " + scanner.nextLine());
    // scanner.close();
    // }

    // int calculate(int calculate) {
    // System.out.println(calculate);
    // return calculate;
    // }

    protected int a;
    protected int b;

    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    abstract int calculate();
}
