public class MainApplication {

    public static void main(String[] args){

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape = shapeFactory.getShape(ShapeType.SQUARE);
        shape.draw();

        Shape shape1 = shapeFactory.getShape(ShapeType.CIRCLE);
        shape1.draw();

        Shape shape2 = shapeFactory.getShape(ShapeType.RECTANGLE);
        shape2.draw();

    }
}
