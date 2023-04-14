package INTERFACE;

public class Audio implements RemoteControl{
    private int volume; // 필드

    @Override
    public void turnOn() {
        System.out.println("Audio 전원을 킵니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio 전원을 끕니다.");
    }

    @Override
    public void setVolume(int volume) { // 볼륨 최소 0 최대 10
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        }
        else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        }
        else {
            this.volume = volume;
        }

        System.out.println("Audio 현재 볼륨 : " + this.volume);
    }
}
