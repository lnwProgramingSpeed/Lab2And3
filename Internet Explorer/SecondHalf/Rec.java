package SecondHalf;

public class Rec {
    private float area;
    private float height;
    private float width;
    private float perimeter;

    public Rec(float hei, float wid) {
        height = hei;
        width = wid;
        area = 0;
        perimeter = 0;
    }

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    public float getArea() {
        return area;
    }

    public float getPerimeter() {
        return perimeter;
    }

    public void setArea(float ara) {
        area = ara;
    }

    public void setPerimeter(float peri) {
        perimeter = peri;
    }
}
