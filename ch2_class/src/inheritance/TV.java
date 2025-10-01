package inheritance;

public class TV {
    int size;
    int channel;
    boolean power;
    String color;

    public TV(int size, int channel, boolean power, String color) {
        this.size = size;
        this.channel = channel;
        this.power = power;
        this.color = color;
    }

    @Override
    public String toString() {
        return "TV [size=" + size + ", channel=" + channel + ", power=" + power + ", color=" + color + "]";
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void channelUp() {
        ++this.channel;
    }

    public void channelDown() {
        --this.channel;
    }

    public int getSize() {
        return size;
    }

    public int getChannel() {
        return channel;
    }

    public boolean isPower() {
        return power;
    }

    public String getColor() {
        return color;
    }

}
