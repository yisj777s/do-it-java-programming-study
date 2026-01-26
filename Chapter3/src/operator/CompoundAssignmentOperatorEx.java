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

        num = 10; // 00001010

        num |= 3; // num = num | 3(00001010 | 00000011 → 00001011)
        System.out.println(num); // 11

        num ^= 2; // num = num ^ 2(00001011 ^ 00000010 → 00001001)
        System.out.println(num); // 9
    }
}
