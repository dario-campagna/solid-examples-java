package srp;

public class SRP {

    public class Graphics {

    }

    public class GeometricRectangle {

        private double width;
        private double height;

        public double area() {
            return width * height;
        }

    }

    public class Rectangle {

        private GeometricRectangle geometricRectangle;
        private Graphics graphics;

        // ...

        public void draw() {
            // Draw geometricRectangle using Graphics
        }

    }

}
