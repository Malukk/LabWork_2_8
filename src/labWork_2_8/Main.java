package labWork_2_8;

import java.util.Arrays;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        //lab 2_8_1

        Random random = new Random();
        Shape[] shapes= new Shape[9];
        for(int i=0; i<shapes.length; i++){
            switch (i){
                case 1:case 3:case 5:case 7:case 8:
                    shapes[i] = new Rectangle("GREY",random.nextInt(10),random.nextInt(10));
                    break;
                case 0:case 4:
                    shapes[i] = new Circle("BRAUN", random.nextInt(15));
                    break;
                case 2:
                    shapes[i] = new Triangle("PINK",3, 4, 5 );
                    break;
                case 6:
                    shapes[i] = new Triangle("RED", 6, 6, 6);

            }
        }
        for (Shape elem : shapes){
            System.out.println(elem + ", area is: " + elem.calcArea());
        }
        double sumArea = 0.0;
        for ( Shape shape1 : shapes){
            sumArea+=shape1.calcArea();
        }
        System.out.println("Total area = " + sumArea);

        double suRectArea =0.0,
                sumTriangleArea=0.0,
                sumCircleArea=0.0;
        for (Shape element : shapes){
            if (element instanceof Rectangle){
                suRectArea+=element.calcArea();

            }else if (element instanceof Circle){
                sumCircleArea+=element.calcArea();
            }else if (element instanceof Triangle){
                sumTriangleArea+=element.calcArea();
            }
        }
        System.out.println("Rectangle total area: "+ suRectArea+ "\nCircle total area: "+ sumCircleArea+
                "\nTriangle total area: "+ sumTriangleArea);

        // lab 2_8_2
        System.out.println("lab 2_8_2------------------------------");
        for (Shape element : shapes){
            element.draw();
        }

        //lab 2_8_3
        System.out.println("lab 2_8_3------------------------------");
        Rectangle rectangle_1 = new Rectangle("BLUE", random.nextInt(15), random.nextInt(15));
        Shape rectangle_2 = new Rectangle("GREEN", random.nextInt(15), random.nextInt(15));
        rectangle_1.draw();
        rectangle_2.draw();
        System.out.println(rectangle_1.compareTo(rectangle_2));

        // lab _2_8_4
        System.out.println("lab _2_8_4------------------------------");
        Rectangle[] rectangles = new Rectangle[6];
        for (int i =0 ; i< rectangles.length; i++){
            rectangles[i] = new Rectangle("RED", random.nextInt(20), random.nextInt(20));
        }
        printShapes(rectangles);
        Arrays.sort(rectangles);
        System.out.println("Sort ->:");
        printShapes(rectangles);

        // lab 2_8_5
        System.out.println("lab 2_8_5---------------------------");
        Shape[] circles = createShapes(10) ;
        printShapes(circles);
        Arrays.sort(circles, new CompareCircle());
        System.out.println("Sort :");
        printShapes(circles);


    }
    public static void printShapes(Shape[] arrey){
        for (Shape elem : arrey){
            elem.draw();
        }
    }

    public  static Shape[] createShapes(int size){
        Shape[] shapes = new Shape[size];
        for (int i = 0; i<shapes.length; i++){
            shapes[i] = new Circle("BLACK", Math.random()* 20);

        }
        return shapes;
    }

}
