package lsp;

public class LSPViolation {

    public static void main() {

        Rectangle r = RectangleFactory.getRectangle();

        r.setWidth(5);
        r.setHeight(10);
        // User knows r is a rectangle
        // He assumes that he can set both width and height as for the base class

        System.out.println(r.area());
        // Now he is surprised to see that area is 100 instead of 50.

    }

}
