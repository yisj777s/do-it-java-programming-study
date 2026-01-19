package operator;

public class RelationalOperatorEx {
    public static void main(String[] args) {
        int myAge = 27;

        boolean value = (myAge > 25);
        System.out.println(value); // true

        value = (myAge < 25);
        System.out.println(value); // false

        value = (myAge >= 27);
        System.out.println(value); // true

        value = (myAge <= 27);
        System.out.println(value); // true

        value = (myAge == 27);
        System.out.println(value); // true

        value = (myAge != 27);
        System.out.println(value); // false

    }
}
