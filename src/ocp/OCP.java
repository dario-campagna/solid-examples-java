package ocp;

public class OCP {

    public abstract class Shape {

        // ...

        public abstract void draw();

    }

    public class Rectangle extends Shape {

        // ...

        @Override
        public void draw() {
            // Draw the rectangle
        }

    }

    public class Circle extends Shape {

        // ...

        @Override
        public void draw() {
            // Draw the circle
        }

    }

    public class GraphicEditor {

        public void drawShape(Shape s) {
            s.draw();
        }

    }

}
