/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elorza.karmele
 */
public class RectangleComputation {
    public static void main(String[] args) {
        double lenght = 2, width = 1, area, perimeter;

        area = width * lenght;
        perimeter = 2 * area;
        // Print results       
        System.out.print("The area of a rectangle with the lenght = " + lenght + " and the width = " + width + " is ");
        System.out.println(area);
        System.out.println("The perimeter is " + perimeter);
    }
}
