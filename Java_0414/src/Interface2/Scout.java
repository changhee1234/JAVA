package Interface2;

public class Scout implements Unit {
    @Override
    public void move() {
        System.out.println("스카웃이 날아갑니다");
    }

    @Override
    public void stop() {
        System.out.println("스카웃이 멈춥니다");
    }

    @Override
    public void attack() {
        System.out.println("스카웃이 총을 쏩니다.");
    }
}
