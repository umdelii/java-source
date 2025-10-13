package inheritance;

public class Audio implements RemoteControl {

    @Override
    public void turnOn() {
        System.out.println("Turn On Audio");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn Off Audio");
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
        System.out.println("Audio 볼륨 : " + this.volume);
    }

}
