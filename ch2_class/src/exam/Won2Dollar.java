package exam;

public class Won2Dollar extends Convertor {

    @Override
    protected double convert(double src) {
        ratio = 1200;
        return src / ratio;
    }

    @Override
    protected String getSrcString() {
        return "원";
    }

    @Override
    protected String getDeString() {
        return "달러";
    }
}
