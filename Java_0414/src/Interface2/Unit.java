package Interface2;

public interface Unit {

    // 기능 제공을 위한 추상 메소드 2개 선언
    void move();

    void stop();

    // 추상 메소드로 추가 기능
    // 자식 클래스에서 추가된 추상 메소드를 반드시 오버라이딩으로 구현해야함
    void attack();

    // 디폴트 메소드로 기능 추가
    // 기존 소스에서 추가 기능을 넣고자 할 경우 사용
    // 디폴트 메소드 사용 시 필요시에만 재정의 하여 사용
    default void stimpack() {
        System.out.println("스팀팩을 사용합니다");
        System.out.println("빨리쏩니다.");
    }
}
