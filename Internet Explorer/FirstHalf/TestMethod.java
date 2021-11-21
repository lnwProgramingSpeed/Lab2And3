package FirstHalf;
import java.io.InputStream;

public class TestMethod {
    public static void main(String[] args) {

        int x = 6;
        int y = 10;
        System.out.println(add(x, y));
    }

    public static int add(int a, int b) {
        int c;
        c = a * b;

        return c;
    }
}