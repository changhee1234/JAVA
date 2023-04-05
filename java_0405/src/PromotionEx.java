
// 타입 변환 : 데이터 타입을 다른 타입으로 변환하는 것
// byte - int,  int - double

// 자동 타입 변환 : Promotion (작은데이터타입 → 큰 데이터 타입)
// 강제 타입 변환 : Casting (큰 데이터타입 → 작은 데이터 타입)


public class PromotionEx {
    public static void main(String[] args) {

        // 자동 타입 변환 사용
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println(intValue);

        char charValue = '가';
        intValue = charValue;
        System.out.println("'가' 의 유니코드 : " + intValue);

        intValue = 500;
        long longValue = intValue;
        System.out.println(longValue);

        intValue = 200;
        double doubleValue = intValue;
        System.out.println(doubleValue);






//        byte b =127;
//        int i = 100;
//        System.out.println(b + i);
//        System.out.println(10/4);
//        System.out.println(10.0/4);
//        System.out.println((char)0x12340041);
//        System.out.println((byte)(b+i));
    }
}