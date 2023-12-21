import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketException;
import java.util.Random;

public class Main5 {
    /*
    5. Создать метод случайным образом выбрасывающий одно из 3-х видов исключений.
    Вызвать этот метод в блоке try-catch, отлавливающим любое из 3-х.
     */

    public static void main(String[] args) {
        try {
            throwRandomException();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public static void throwRandomException() throws Exception {
        int random = new Random().nextInt(3);
        switch (random) {
            case 0 -> throw new IOException("IOException");
            case 1 -> throw new FileNotFoundException("FileNotFoundException");
            case 2 -> throw new SocketException("SocketException");
        }
    }
}
