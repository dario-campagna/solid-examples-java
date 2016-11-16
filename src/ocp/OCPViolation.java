package ocp;

public class OCPViolation {

    public class Shape {
        // ...
    }

    public class Rectangle extends Shape {
        // ...
    }

    public class Circle extends Shape {
        // ...
    }

    public class GraphicEditor {

        public void drawShape(Shape s) {
            if (s instanceof Rectangle) {
                drawRectangle((Rectangle) s);
            } else if (s instanceof Circle) {
                drawCircle((Circle) s);
            }
        }

        public void drawRectangle(Rectangle rectangle) {
            // ...
        }

        public void drawCircle(Circle c) {
            // ...
        }

    }

}
