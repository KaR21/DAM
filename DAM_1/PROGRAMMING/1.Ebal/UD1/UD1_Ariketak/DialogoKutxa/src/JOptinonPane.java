/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elorza.karmele
 */
import javax.swing.JOptionPane;   // Needed to use JOptionPane

public class JOptinonPane {
    public static void main(String[] args) {
      String radiusStr;
      double radius, area;
      // Read input String from dialog box
      radiusStr = JOptionPane.showInputDialog("Enter the radius of the circle");
      radius = Double.parseDouble(radiusStr);   // Convert String to double
      area = radius*radius*Math.PI;
      System.out.println("The area is " + area);
   }
}
