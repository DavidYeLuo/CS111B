/**
 *LabelDemo2 --- The program LabelDemo2 starts a GUI program that
 *simply displays pictures and labels
 *@author        David Ye Luo
 *@version       1.0
 *@since         2016-08-25
*/

import java.awt.*;
import javax.swing.*;

public class LabelDemo2 {
	
    JFrame frame;
    JPanel panel;
    JLabel label1,label2,label3,label4;
	
	/**
	*This constructor initializes variables
	*and use predefined class methods to display pictures and labels
	*the primary application frame
	*@param void or nothing
	*/
    public LabelDemo2() {
        frame = new JFrame("RIP Harambe");	//creates a frame with the title "RIP Harambe"
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon icon = new ImageIcon("harambe.jpg");

        panel = new JPanel();
        panel.setBackground(Color.cyan);
        panel.setPreferredSize(new Dimension(300,700));
		
        label1 = new JLabel("Harambe Left", icon, SwingConstants.CENTER);

        label2 = new JLabel("Harambe Right", icon, SwingConstants.CENTER);
        label2.setHorizontalTextPosition(SwingConstants.LEFT);
        label2.setVerticalTextPosition(SwingConstants.BOTTOM);
		
        label3 = new JLabel("Harambe Above", icon, SwingConstants.CENTER);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
		
        label4 = new JLabel("Harambe Bottom", icon, SwingConstants.CENTER);
        label4.setHorizontalTextPosition(SwingConstants.CENTER);
        label4.setVerticalTextPosition(SwingConstants.TOP);
		
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);
		
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
		
	}
	/**
	*This is the main method that creates LabelDemo2 as an object
	*The constructor of LabelDemo2 does most of the job
	*@param Unused
	*@return Nothing
	*/
    public static void main(String[] args) {
        LabelDemo2 demo = new LabelDemo2();
        demo.frame.setLocationRelativeTo(null); //Puts the frame to the middle of the screen
    }
}