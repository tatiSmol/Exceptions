public class Main2 {
    /*
    2. Написать код, который создаст, а затем отловит ArrayIndexOutOfBoundsException.
    */

    public static void main(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException("Throwing an exception forcibly");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
