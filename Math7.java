public class Math7{
    
        public static void main(String[] args) {
            // Circle: Area and Circumference
            double radius = 5;
            double circleArea = Math.PI * Math.pow(radius, 2);
            double circleCircumference = 2 * Math.PI * radius;
            System.out.println("Circle - Area: " + circleArea + ", Circumference: " + circleCircumference);
    
            // Rectangle: Area and Perimeter
            double length = 7, width = 4;
            double rectangleArea = length * width;
            double rectanglePerimeter = 2 * (length + width);
            System.out.println("Rectangle - Area: " + rectangleArea + ", Perimeter: " + rectanglePerimeter);
    
            // Triangle: Area (using Heron's formula)
            double a = 3, b = 4, c = 5;
            double s = (a + b + c) / 2; // semi-perimeter
            double triangleArea = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("Triangle - Area: " + triangleArea);
    
           
        }
    }
   
       
    
           
      
    

