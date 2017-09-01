/** this program computes the area and volume
 *  of a cylinder  chapter 2 assignment 2.2*/


import   java.util.Scanner;

public class VolCylindeer {
            public static void vol (float x, float y){
                final float PI = 22/7;
                float area = x*x * PI;
                float volume = area * y;
                System.out.println("The area is " + area + "\n The " + "volume is " + volume);
            };

    public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            System.out.println("Please enter the radius the cylinder " );
            float  radius = input.nextFloat();
            System.out.println("Please enter the height of the cylinder " );
            float  height = input.nextFloat();
            vol(radius, height);
    };
};
