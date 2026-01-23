package operator;

public class CompoundAssignmentOperatorEx {
    public static void main(String[] args) {
        int num = 10;

        num += 2; // num = num + 2
        System.out.println(num); // 12

        num -= 2; // num = num - 2
        System.out.println(num); // 10

        num *= 2; // num = num * 2
        System.out.println(num); // 20

        num /= 2; // num = num / 2
        System.out.println(num); // 10

        num %= 2; // num = num % 2
        System.out.println(num); // 0

        num = 10; // 00001010

        num <<= 2; // num = num << 2(00001010 << 2 → 00101000)
        System.out.println(num); // 40

        num >>= 2; // num = num >> 2(00101000 >> 2 → 00001010)
        System.out.println(num); // 10

        num >>>= 2; // num = num >>> 2(00001010 >>> 2 → 00000010)
        System.out.println(num); // 2

        num = 10; // 00001010

        num &= 2; // num = num & 2(00001010 & 00000010 → 00000010);
        System.out.println(num); // 2
    }
}
