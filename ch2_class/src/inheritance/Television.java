package inheritance;

public class Television implements RemoteControl {

    @Override
    public void turnOn() {
        System.out.println("Turn On Television");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn Off Television");
    }

    private int volume;

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("Television 볼륨 : " + this.volume);
    }

}
