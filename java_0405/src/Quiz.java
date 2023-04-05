import java.util.Scanner;

public class Quiz {
    // 84p의 open challenge 문제
    public  static void quiz01(){
        Scanner sc = new Scanner(System.in);
        System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
        System.out.println("철수 >> ");
        int chulSu = sc.nextInt();


        System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
        System.out.println("영희 >> ");
        int youngHee = sc.nextInt();

        else if(chulSu.equals("가위")){
            s
        }
    }

    // 실습문제 2번
    public static void quiz02(){
        Scanner sc = new Scanner(System.in);
        System.out.println("몇 층인지 입력하세요>>");
        int whatF = sc.nextInt();

//        int zipM = whatF * 5;
//        System.out.println(zipM + "m 입니다.");
        if (whatF <= 0) {
            System.out.println("잘못된 데이터 입니다.");
        }
        else {
            System.out.println(whatF * 5 + "M 입니다.");
        }



    }

    // 실습문제 3번
    public static void quiz03(){
        Scanner sc = new Scanner(System.in);
        System.out.println("x 값을 입력하세요>>");
        int whatX = sc.nextInt();

        int whatY = (whatX * whatX) - (3 * whatX) + 7;
        System.out.println("x=" + whatX + "," + "y=" + whatY);
    }

    // 실습문제 4번
    public static void quiz04() {
        Scanner sc = new Scanner(System.in);
        System.out.println("점 (x,y)의 좌표를 입력하세요>>");
        int nemoX = sc.nextInt();
        int nemoY = sc.nextInt();

        if (nemoX < 50) {
            if (nemoY < 50) {
                System.out.println("점(" + nemoX + "," + nemoY + ")은 (50, 50)과 (100,100)의 사각형 밖에 있습니다");
            } else {
                System.out.println("점(" + nemoX + "," + nemoY + ")은 (50, 50)과 (100,100)의 사각형 밖에 있습니다");
            }
        } else if (nemoX >= 50) {
            if (nemoY < 50) {
                System.out.println("점(" + nemoX + "," + nemoY + ")은 (50, 50)과 (100,100)의 사각형 밖에 있습니다");
            }
            else if (nemoY >= 50) {
                if (nemoY > 100){
                    System.out.println("점(" + nemoX + "," + nemoY + ")은 (50, 50)과 (100,100)의 사각형 밖에 있습니다");
                }
                else {
                    System.out.println("점(" + nemoX + "," + nemoY + ")은 (50, 50)과 (100,100)의 사각형 안에 있습니다");
                }
            }
        }
    }

    // 실습문제 5번
    public static void quiz05(){
        Scanner sc = new Scanner(System.in);
        System.out.println("논리 연산을 입력하세요>>");

        boolean a = sc.nextBoolean();
        String op = sc.next();
        boolean b = sc.nextBoolean();

        boolean res = false; // 결과값을 저장하는 변수, 기본값으로 false 설정

        switch (op) {
            case "AND" -> res = a && b;
            case "OR" -> res = a || b;
            case "and" -> res = a && b;
            case "or" -> res = a || b;
            default -> System.out.println("잘못된 논리 연산자입니다.");
        }
        System.out.println(res);
    }

    // 실습문제 6번
    public static void quiz06() {
        Scanner sc = new Scanner(System.in);
        System.out.println("돈의 액수를 입력하세요>>");

        int money = sc.nextInt();

        int n50000 = money / 50000; //오만원권 개수
        money = money % 50000; //나머지
        int n10000 = money / 10000; //만원권 개수
        money = money % 10000; //나머지
        int n1000 = money / 1000; //천원권 개수
        money = money % 1000; //나머지
        int n500 = money / 500; //오백원 개수
        money = money % 500; //나머지
        int n100 = money / 100; //백원 개수
        money = money % 100; //나머지
        int n10 = money / 10; //십원  개수
        money = money % 10; //나머지

        System.out.println("오만원" + n50000 + "개");
        System.out.println("만원" + n10000 + "개");
        System.out.println("천원" + n1000 + "개");
        System.out.println("오백원" + n500 + "개");
        System.out.println("백원" + n100 + "개");
        System.out.println("십원" + n10 + "개");
        System.out.println("1원" + money + "개");
    }

    // 실습문제 7번
    public static void quiz07(){
        System.out.println("학점을 입력하세요 :");
        String grade = sc.next();

        switch(grade) {
            case "A":
            case "B":
                System.out.println("Excellent");
                break;
            case "C":
            case "D":
                System.out.println("Good);
                break;
            case "F":
                System.out.println("Excellent");
        }
    }

    // 실습문제 8번
    public static void quiz08(){
        System.out.println("커피 주문하세요 : ");
        String coffee = sc.next(); //문자열 받기
        System.out.println("몇잔인지 입력하세요 :");
        int count = sc.nextInt(); //커피 수 입력받기

        if (coffee.equals("에스프레소")){
            System.out.println(2000 * count + "원입니다.");
        }
    }

    // 실습문제 9번
    public static void quiz09(){

    }

    // 실습문제 10번
    public static void quiz10(){

    }
    public static void main(String[] args) {
//        quiz01();
//        quiz02();
//        quiz03();
//        quiz04();
        quiz05();
//        quiz06();
//        quiz07();
//        quiz08();
//        quiz09();
//        quiz10();

    }
}
