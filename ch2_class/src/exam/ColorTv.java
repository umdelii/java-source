package exam;

public class ColorTv extends Tv {

    public ColorTv(int size) {
        super(size);
    }

    private int color;

    public ColorTv(int size, int color) {
        super(size);
        this.color = color;
    }

    void printProperty() {
        System.out.println(super.getSize() + "인치 " + color + "컬러");
    }
}
