package it.develhope.overload;

public class Shape {
    private String shapeName = "Undefined shape";
    private int numberOfEdges;

    //generic constructor shape
    public Shape(){
        System.out.println("The Shape was created");
        shapeName = "Undefined";
    }

    //constructor for CIRCLE
    public Shape(double radius){
        shapeName = "Circle";
        System.out.println("Object: " + shapeName + " was created");
    }

    //constructor for SQUARE
    public Shape(int numberOfEdges, double edgeLength){
        shapeName = "Square";
        this.numberOfEdges = numberOfEdges;
        numberOfEdges = 4;
        System.out.println("Object: " + shapeName + " was created");
    }

    //constructor for RECTANGLE
    public Shape(int numberOfEdges, double e1,double e2){
        shapeName = "Rectangle";
        this.numberOfEdges = numberOfEdges;
        System.out.println("Object: " + shapeName + " was created");
    }

    //constructor for TRIANGLE
    public Shape(int numberOfEdges, double e1, double e2, double e3){
        shapeName = "Triangle";
        this.numberOfEdges = numberOfEdges;
        System.out.println("Object: " + shapeName + "was created");
    }


    public void getShapeDetails(){
        System.out.println("-Shape: " + shapeName + " -Edges: "+ numberOfEdges);
    }
}

