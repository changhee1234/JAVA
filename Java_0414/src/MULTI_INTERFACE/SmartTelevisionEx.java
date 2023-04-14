package MULTI_INTERFACE;

public class SmartTelevisionEx {
    public static void main(String[] args) {

        // 인터페이스 RemoteControl, Searchable 을 다중 상속받은 클래스 SmartTelevision 타입의 변수 stv를 선언과 동시에 객체 생성
        SmartTelevision stv = new SmartTelevision();

        // RemoteControl 의 멤버와 Searchable 의 멤버를 모두 사용할 수 있음
        stv.turnOn();
        stv.setVolume(50);
        stv.setVolume(5);
        stv.setMute(false);
        stv.search("DCinside");
        stv.turnOff();

        System.out.println("\n--------------------------------\n");

        RemoteControl i_rc = null;
        Searchable i_sc = null;

        i_rc = stv;

        i_rc.turnOn();
        i_rc.setVolume(-100);
        i_rc.setMute(true);
        // i_rc는 RemoteControl 인터페이스 타입의 변수 이므로 인터페이스 RemoteControl 의 멤버만 사용할 수 있음
//        i_rc.search("DCinside");
        i_rc.turnOff();

        i_sc.search("DCinside");
        // i_sc는 Searchable 인터페이스 타입의 변수 이므로 인터페이스 Searchable의 멤버만 사용할 수 있음
//        i_sc.turnOn(); // 오류 발생
//        i_sc.turnOff();
    }
}
