package operator.practice;

public class Q08 {
    public static void main(String[] args) {
        int mathScore = 90;
        int engScore = 70;
        int korScore = 85;

        int totalScore = mathScore + engScore + korScore; // 총점 구하기
        System.out.println(totalScore); // 245

        double avgScore = totalScore / 3.0;    // 평균 구하기
        System.out.println(avgScore); // 81.66666666666667
    }
}
