public class Main4 {
    /*
    4. Бросить одно из существующих в JDK исключений, отловить его
    и обернуть его в свое кастомное исключение указав в качестве причины отловленное.
     */

    public static void main(String[] args) throws CustomException {
        int[] numbers = new int[1];

        try {
            int num = getSecondValue(numbers);
        } catch (ArrayIndexOutOfBoundsException ex) {
            throw new CustomException(ex);
        }
    }

    public static int getSecondValue(int[] array) {
        return array[1];
    }
}

class CustomException extends Exception {
    public CustomException(Throwable cause) {
        super(cause);
    }
}
