class RectangleClass {
    //Create a class Rectangle with attributes length and width, each of which
    //defaults to 1. Provide methods that calculate the rectangle’s perimeter and area. It has set and get
    //methods for both length and width. The set methods should verify that length and width are each
    //floating-point numbers larger than 0.0 and less than 20.0. Write a program to test class Rectangle.
    private float length;
    private float width;

    RectangleClass() {
        length = 1;
        width = 1;
    }

    RectangleClass(float length, float width) {
        setLength(length);
        setWidth(width);
    }

    public void setLength(float length) {
        if (length > 0.0 && length <= 20) {
            this.length = length;
        }
    }

    public float getLength() {
        return length;
    }

    public void setWidth(float width) {
        if (width > 0.0 && width <= 20) {
            this.width = width;
        }
    }

    public float getWidth() {
        return width;
    }

    public float getRectPerimeter() {
        return (length + width) * 2;
    }

    public float getRectArea() {
        return length * width;
    }
}

public class RectangleClass8_4 {
    public static void main(String[] args) {
        RectangleClass first = new RectangleClass();
        System.out.println("Length = " + first.getLength() + "; Width = " + first.getWidth());
        first.setLength(3);
        first.setWidth(7);
        System.out.println("Length = " + first.getLength() + "; Width = " + first.getWidth());
        System.out.println("Perimeter = " + first.getRectPerimeter());
        System.out.println("Area = " + first.getRectArea());

    }
}
