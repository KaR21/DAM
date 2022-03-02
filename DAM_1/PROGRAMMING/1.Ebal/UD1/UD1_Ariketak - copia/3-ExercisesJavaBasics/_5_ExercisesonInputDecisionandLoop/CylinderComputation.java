package _5_ExercisesonInputDecisionandLoop;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elorza.karmele
 */
public class CylinderComputation {
    public static void main(String[] args) {
        double radius = 1, height = 2, surfaceArea, baseArea, volume, Area;
        final double PI = 3.14159265;
      
        surfaceArea = 2 * PI * radius + 2 * PI * Math.pow(radius,2);
        baseArea = PI * Math.pow(radius,2);
        volume = baseArea * height;
        Area = surfaceArea + volume;
        
        // Print results       
        System.out.print("The surface area is ");
        System.out.println(surfaceArea);
        System.out.print("The base area is ");
        System.out.println(baseArea);
        System.out.print("The area is ");
        System.out.println(Area);
        System.out.print("The volume is ");
        System.out.println(volume);
   }
}
