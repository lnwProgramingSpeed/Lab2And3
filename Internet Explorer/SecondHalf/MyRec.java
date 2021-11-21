package SecondHalf;

public class MyRec {
    public static void main(String[] arg) {
        Rec Square = new Rec(5, 5);
        Rec non_square = new Rec(8, 5);

        // square data object
        Square.setArea(Square.getHeight() * Square.getWidth());
        Square.setPerimeter(2 * (Square.getHeight() + Square.getWidth()));

        // non data object
        non_square.setArea(non_square.getHeight() * non_square.getWidth());
        non_square.setPerimeter(2 * (non_square.getHeight() + non_square.getWidth()));

        // Print square
        System.out.println("Square 5 * 5");
        System.out.println("Area: " + Square.getArea());
        System.out.println("Perimeter: " + Square.getPerimeter());

        // Print non_square
        System.out.println("Square 8 * 5");
        System.out.println("Area: " + non_square.getArea());
        System.out.print("Perimeter: " + non_square.getPerimeter());

    }

}
