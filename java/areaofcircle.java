import java.util.*;
public class areaofcircle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float r = sc.nextInt();
        double area = r*r*3.14;
        double perimeter = 2*3.14*r;
        System.out.print("The area of the circle is :-");
        System.out.println(area);
        System.out.print("The perimeter of the circle");
        System.out.println(perimeter);

    }
    
}
