package inheritance;

public class CaptionTv extends TV {
    boolean caption;

    public CaptionTv(int size, int channel, boolean power, String color) {
        super(size, channel, power, color);
    }

    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }
}
