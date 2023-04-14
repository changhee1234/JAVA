package Interface4;

public class VehicleEx {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();

        // 부모인 Vebicle 인터페이스 타입의 변수에 자식 클래스인 Bus 클래스의 객체를 대입하였기 때문에
        // Vehicle 타입의 멤버만 사용 가능

//        vehicle.checkFare(); // Bus 타입 전용 멤버

        // 자식 클래스 타입의 변수를 선언하고 부모 타입의 변수를 강제 타입 변환으로 대입함
        // 원본이 자식 클래스 타입의 객체일 경우에만 강제 타입 변환이 가능함
        Bus bus = (Bus) vehicle;
        bus.run();
        bus.checkFare();

    }
}
