package TIRE;

public class Car {

    // 인터페이스 타입의 변수 선언
    // 해당변수에 자식 클래스 타입의 객체를 저장
    Tire frontLeftTire = new HankookTire();
    Tire frontRightTire = new HankookTire();

    Tire backLeftTire = new HankookTire();
    Tire backRightTire = new HankookTire();

    void run() {
        frontLeftTire.roll();
        frontRightTire.roll();
        backLeftTire.roll();
        backRightTire.roll();
    }

}
