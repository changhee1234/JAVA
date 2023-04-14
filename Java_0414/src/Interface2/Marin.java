package Interface2;

public class Marin implements Unit {
    @Override
    public void move() {
        System.out.println("마린이 달려갑니다");
    }

    @Override
    public void stop() {
        System.out.println("마린이 멈춥니다.");
    }

    @Override
    public void attack() {
        System.out.println("마린이 총을 쏩니다.");
    }

    @Override
    public void stimpack() {
        System.out.println("마린이 스팀팩을 사용합니다");
        System.out.println("체력이 10 낮아지고 모든 속도가 2배로 증가합니다.");
    }
}
