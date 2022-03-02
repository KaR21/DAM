
package grafiko.sinplea;
import com.sun.istack.internal.logging.Logger;
import java.awt.*;
import java.util.logging.Level;
import javax.swing.*;
/**
 * Tic-Tac-Toe: Two-player Graphic version with better OO design.
 * The Board and Cell classes are separated in their own classes.
 */
@SuppressWarnings("serial")
public class NirePanela extends JPanel {
  
 
   /** Constructor to setup the UI and game components */
   public NirePanela() {
     
   }
 
 
    @Override
   public void paintComponent(Graphics g) {  // invoke via repaint()
      super.paintComponent(g);    // fill background
      this.setBackground(new Color(0,0,0)); // set its background color
      g.drawLine(0, this.getWidth()/3, this.getWidth(),this.getWidth()/3);
      g.drawLine(0, this.getWidth()/3 + this.getWidth()/3, this.getWidth(),this.getWidth()/3 + this.getWidth()/3);
      
   }
 
   /** The entry "main" method */
   public static void main(String[] args) {
      // Run GUI construction codes in Event-Dispatching thread for thread safety
      javax.swing.SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            JFrame frame = new JFrame("NirePanela JFrame baten barruan");
            // Set the content-pane of the JFrame to an instance of main JPanel
            frame.setContentPane(new NirePanela());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setLocationRelativeTo(null); // center the application window
            frame.setVisible(true);            // show it
            try{
                  Thread.sleep(5000);
            } catch (InterruptedException ex){
                  java.util.logging.Logger.getLogger(NirePanela.class.getName()).log(Level.SEVERE, null, ex);
            }
            frame.setSize(300, 300);
         }
      });
   }
}