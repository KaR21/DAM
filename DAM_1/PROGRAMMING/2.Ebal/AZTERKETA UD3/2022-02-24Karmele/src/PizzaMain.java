import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class PizzaMain implements ActionListener {
 final static String LABEL_TEXT = "Please choose the size of your pizza:";
StringBuilder selectedOutput = new StringBuilder();
JFrame frame;
JPanel contentPane;
JLabel label;
JButton button, button2, button3, button4, button5, button6;
 /*Button 4,5,6 will be used for more toppings.
 JFrame, JPanel, JLabel, & JButton is used for adding the variables of all 
 the buttons, panels, labels, and frame so they're able to be added into the 
 JPanel in GUI.*/ 

public PizzaMain() {
    frame = new JFrame("EAST SIDE PIZZA");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    contentPane = new JPanel();
    contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));
    contentPane.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

    label = new JLabel(LABEL_TEXT);
    label.setAlignmentX(JLabel.TOP_ALIGNMENT);
    contentPane.add(label);
    label.setFont(new Font("Garamond", Font.ITALIC, 15));

    //Add other pizza buttons here  Size buttons ..Small Pizza,Large Pizza ,Medium Pizza,Family Size
    //Once these buttons are created add then to the contentPane
    //Since your user initial point of entry
    button = new JButton("Small");
    button.setAlignmentX(JButton.LEFT_ALIGNMENT);
    button.setAlignmentY(JButton.CENTER_ALIGNMENT);
    button.setActionCommand("Small");
    button.addActionListener(this);
    contentPane.add(button);
    button.setFont(new Font("Papyrus", Font.ITALIC, 13));

    JButton largePizza = new JButton("Large");
    largePizza.setAlignmentX(JButton.LEFT_ALIGNMENT);
    largePizza.setAlignmentY(JButton.CENTER_ALIGNMENT);
    largePizza.setActionCommand("Large");
    largePizza.addActionListener(this);
    contentPane.add(largePizza);

    //This panel is displayed on the second stage after the user has selected his/her Pizza size
    //Add other pizza type button  Pepperoni,Cheese,Ham,blah blah
    //add these buttons to jpanel
    //set each button actionListener  copy paste
    JPanel jPanel = new JPanel();
    jPanel.setBackground(Color.GREEN);
    jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.PAGE_AXIS));
    jPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
    button4 = new JButton("Pepperoni");
    button4.setAlignmentX(JButton.LEFT_ALIGNMENT);
    button4.setAlignmentY(JButton.CENTER_ALIGNMENT);
    button4.setFont(new Font("Papyrus", Font.ITALIC, 13));
    button4.addActionListener(this);
    jPanel.add(button4);

    button5 = new JButton("Cheese");
    button5.setAlignmentX(JButton.LEFT_ALIGNMENT);
    button5.setAlignmentY(JButton.CENTER_ALIGNMENT);
    button5.setFont(new Font("Papyrus", Font.ITALIC, 13));
    button5.addActionListener(this);
    jPanel.add(button5);


    //This page is the last selection stage you can have many pages in form of JPanel as above
    //add other options here ,veggetables,topping
    //add them to jPanel2
    JPanel jPanel2 = new JPanel();
    jPanel2.setBackground(Color.RED);
    jPanel2.setLayout(new BoxLayout(jPanel2, BoxLayout.PAGE_AXIS));
    jPanel2.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
    button6 = new JButton("Vegetables");
    button6.setAlignmentX(JButton.LEFT_ALIGNMENT);
    button6.setAlignmentY(JButton.CENTER_ALIGNMENT);
    button6.setActionCommand("Small in Japen2");
    button6.setFont(new Font("Papyrus", Font.ITALIC, 13));
    button6.addActionListener(this);

    JButton button7 = new JButton("meat");
    button7.setAlignmentX(JButton.LEFT_ALIGNMENT);
    button7.setAlignmentY(JButton.CENTER_ALIGNMENT);
    button7.setActionCommand("Small in Japen2");
    button7.setFont(new Font("Papyrus", Font.ITALIC, 13));
    button7.addActionListener(this);
    jPanel2.add(button7);

    JButton backButtonToPanel1 = new JButton("<<<");
    backButtonToPanel1.setAlignmentX(JButton.LEFT_ALIGNMENT);
    backButtonToPanel1.setAlignmentY(JButton.CENTER_ALIGNMENT);
    backButtonToPanel1.setFont(new Font("Papyrus", Font.ITALIC, 13));
    backButtonToPanel1.addActionListener(this);
    jPanel2.add(backButtonToPanel1);

    JTextField output = new JTextField();
    jPanel2.add(output);

    /*button to select another option following option {pepperoni,cheese} these options are found in jPanel2
    When user chooses small pizza  contentPane will removeAll its childrens,repaint its self and validate its action
    It will repaint itself again and then add second panel
    User selected option is then stored in a StringBuilder log will show the activity
    Once done it will take the user to the next Panel for more options
    This step is used to define buttons actions*/
    button.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e) {
            selectedOutput.append("selected -> small");
            contentPane.setLayout(new CardLayout());
            contentPane.removeAll();
            contentPane.repaint();
            contentPane.revalidate();
            contentPane.repaint();
            contentPane.add(jPanel);
            contentPane.revalidate();
            System.out.println("small clicked will take you to jpanel 1");
        }
    });

    largePizza.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e) {
            selectedOutput.append("selected -> Large Pizza");
            contentPane.setLayout(new CardLayout());
            contentPane.removeAll();
            contentPane.repaint();
            contentPane.revalidate();
            contentPane.repaint();
            contentPane.add(jPanel);
            contentPane.revalidate();
            System.out.println("large clicked will take you to jpanel 1");
        }
    });

    // button to select the following optins  {pepperoni,meat} options in JPanel 2
    button4.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e) {
            selectedOutput.append("   and,pepperoni");
            output.setText(selectedOutput.toString());
            contentPane.setLayout(new CardLayout());
            contentPane.removeAll();
            contentPane.repaint();
            contentPane.revalidate();
            contentPane.repaint();
            contentPane.add(jPanel2);
            contentPane.revalidate();
            System.out.println("large clicked will take you to jpanel 2");
        }
    });

    // button to select the following optins  {pepperoni,meat} options in JPanel 2
    button5.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e) {
            selectedOutput.append("   and,cheese");
            output.setText(selectedOutput.toString());
            contentPane.setLayout(new CardLayout());
            contentPane.removeAll();
            contentPane.repaint();
            contentPane.revalidate();
            contentPane.repaint();
            contentPane.add(jPanel2);
            contentPane.revalidate();
            System.out.println("This will remain here showing user final option");
        }
    });

    button7.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e) {
            output.setText("");
            selectedOutput.append("  topped with meat");
            output.setText(selectedOutput.toString());
            contentPane.setLayout(new CardLayout());
            contentPane.removeAll();
            contentPane.repaint();
            contentPane.revalidate();
            contentPane.repaint();
            contentPane.add(jPanel2);
            contentPane.revalidate();
            System.out.println("This will remain here showing user final option");

        }
    });

    backButtonToPanel1.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e) {
            contentPane.removeAll();
            contentPane.repaint();
            contentPane.revalidate();
            contentPane.repaint();
            contentPane.add(jPanel);
            contentPane.revalidate();
            System.out.println("We are going back");

        }
    });
    frame.add(contentPane);
    frame.pack();
    frame.setVisible(true);
}

private static void runGUI() {
    JFrame.setDefaultLookAndFeelDecorated(true);
    PizzaMain size = new PizzaMain();
}

public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            runGUI();
        }
    });
}

@Override
public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub

}
}