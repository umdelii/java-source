package object;

public class TV {

    // TV를 산다고 가정해보자

    // 속성 : 크기(숫자), 채널(숫자), 파워(전원)(boolean), 색상 등
    int size;
    int channel;
    boolean power;
    String color;

    // 생성자
    public TV() {
    }

    @Override
    public String toString() {
        return "TV [size=" + size + ", channel=" + channel + ", power=" + power + ", color=" + color + "]";
    }

    // 기능 : 파워를 넣거나 안 넣거나, 채널 변경, 볼륨 조절 등
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
    } // boolean 얘만 is~임;땀

    public String getColor() {
        return color;
    }

}
