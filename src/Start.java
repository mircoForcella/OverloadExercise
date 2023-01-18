import it.develhope.overload.Shape;

public class Start {
    public static void main(String[] args) {

        //objects with 5 different constructors
        Shape undefined = new Shape();
        Shape circle = new Shape(12);
        Shape square = new Shape(4,5);
        Shape rectangle = new Shape(4, 25,40);
        Shape triangle = new Shape(3,10,10,15);

        //getting the details of every object created
        undefined.getShapeDetails();
        circle.getShapeDetails();
        square.getShapeDetails();
        rectangle.getShapeDetails();
        triangle.getShapeDetails();
    }
}
