public class Rectangle{


    double length;
    double breadth;
    double area;
    double perimeter;

    Rectangle(double l, double b){

        length = l;
        breadth = b;
    }
    
    void areaofRectangle(){
    area = length*breadth;
    System.out.println("Area of rectangle is" + area);

    }

    void areaofPerimeter(){
        area = 2*(length+breadth);
        System.out.println("Area of rectangle is" + perimeter);

    }

}

    
    
    
    
    
    
    
    
    
    
    