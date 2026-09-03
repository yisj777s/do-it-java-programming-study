package exercise.q08.sorting;

public interface Sort {
    int[] ascending(int[] arr);

    int[] descending(int[] arr);

    default void description() {
        System.out.println("숫자를 정렬하는 알고리즘입니다.");
    }
}
