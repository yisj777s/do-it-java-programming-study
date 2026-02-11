package loopexample;

/**
 * break문으로 반복문 빠져나가기
 */
public class BreakExample2 {
    public static void main(String[] args) {
        int sum = 0;
        int num;

        for (num = 0; sum < 100; num++) {
            sum += num;
            if (sum > 100) { // sum이 100을 초과할 때 (종료 조건)
                break;       // 반복문 중단
            }
        }

        System.out.println("num : " + num);
        System.out.println("sum : " + sum);
    }
}
