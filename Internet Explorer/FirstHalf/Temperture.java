package FirstHalf;
public class Temperture {
    public static void main(String[] arg) {
        int Cel = 40;
        int x = 0;
        while (Cel <= 80) {
            x = cToF(Cel);
            System.out.println(Cel + " " + x);
            Cel = Cel + 5;
        }
    }

    public static int cToF(int c) {
        c = (int) ((9.0 / 5.0) * c + 32);

        return c;
    }
}
