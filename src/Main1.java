public class Main1 {
    /*
    1. Объявите ссылочную переменную со значением null.
    Вызовите метод у этой переменной.
    Отловить возникшее исключение с помощью блока try-catch.
     */

    public static void main(String[] args) {
        String str = null;
        try {
            str.notify();
        } catch (NullPointerException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }
}
