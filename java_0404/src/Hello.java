
// 1. 클래스의 이름은 해당클래스 파일명
// 2. 하나의 파일에 하나의 클래스 작성
// 3. 클래스 이름은 첫글자는 대문자, 나머지는 소문자
// 4. 2개 이상의 단어로 이름을 정할 경우 각 단어의 첫글자는 대문자, 나머지는 소문자
// 5. 파일명과 같은 클래스에만 public 사용 가능

public class Hello { // 하나의 파일에 하나의 클래스 사용 // public - 접근제한자 // 코드블록 안에 작성

    // 메소드( 자바스크립트의 함수와 동일한 기능을 가지고 있음 )
    // 클래스의 멤버일 경우이름을 메소드라고 함
    // 클래스의 멤버가 아닐 경우 함수라고 함
    public static int sum(int n, int m) {
        return n + m;
    }

    // 자바 프로그램의 시작점(public static void main())
    // String[] args - 실행옵션
    public static void main(String[] args) {
        int i = 20; // 해당 데이터 타입으로 변수 선언. ex) int, char
        int s;      // 메소드 내에서 선언된 변수는 지역변수
        char a;     // ; 로 한 문장의 끝을 인식

        // 식별자
        // 1. 영어사용
        // 2. 대소문자 구분
        // 3. 특수문자 사용불가( _ , $ 제외 )
        // 4. 숫자 사용 가능(2번째 이후로 가능)
        // 5. 자바 예약어 사용 불가
        // 6. 첫단어는 모두 소문자 두번째 이후는 첫글자만 대문자
        // 6-1. class 는 무조건 첫글자 대문자, 나머지 소문자

        s = sum(i, 10);
        a = '?';

        System.out.println(a); // 표준 출력 스트림 - System.out.println = console.log
        System.out.println("Hello");
        System.out.println(s);
    }
}

// 자바의 데이터 타입
// *boolean : 논리형, JS의 논리형과 동일, true, false

// -- 정수형 : 소수점이 없는 데이터타입 ( 음수, 양수 ) --
// --문자를 표현--
// *char : 문자 타입이면서 정수 타입임

// --숫자를 표현--
// *byte : 1byte
// short : 2byte
// *int(기본형) : 4byte
// long : 8byte, 숫자 뒤에 L 붙임

// -- 실수형 : 소수점이 있는 데이터타입 ( 음수, 양수 ) --
// float : 4byte, 숫자 뒤에 F붙임
// *double(기본형) : 8byte, 크기가 커서 float에 비해 정확함

// 레퍼런스 타입(참조) : 1개이며 용도는 3가지
// 1. 클래스(class)에 대한 레퍼런스
// 2. 인터페이스(interface)에 대한 레퍼런스
// 3. 배열(array)에 대한 레퍼런스

// 기본타입 - 데이터 자체를 저장
// 참조타입 - 데이터가 존재하는 메모리주소 저장
















