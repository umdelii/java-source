package inheritance;

public class RemoteControlEx {
    public static void main(String[] args) {
        RemoteControl remoteControl = new Audio();

        remoteControl.turnOn();
        remoteControl.setVolume(9);
        remoteControl.setMute(true);
        remoteControl.setVolume(14);
        remoteControl.turnOff();

        remoteControl = new Television();
        remoteControl.turnOn();
        remoteControl.setVolume(7);
        RemoteControl.changeBattery();
        remoteControl.setMute(true);
        remoteControl.setVolume(-1);
        remoteControl.turnOff();

        // 익명 클래스 : 1회성
        remoteControl = new RemoteControl() {

            @Override
            public void turnOn() {
                System.out.println("Turn On Radio");
            }

            @Override
            public void turnOff() {
                System.out.println("Turn Off Radio");
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
                System.out.println("Radio 볼륨 : " + this.volume);
            }

        };

        remoteControl.turnOn();
        remoteControl.setVolume(8);
        remoteControl.setMute(true);
        remoteControl.turnOff();
    }
}
