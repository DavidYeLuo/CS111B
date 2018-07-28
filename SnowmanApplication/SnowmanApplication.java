//********************************************************************
//  SnowmanApplication.java       Author: Lewis/Loftus
//  Modified: Conner   Date: 1/13/15
//  Demonstrates basic drawing methods and the use of color.
//  Modified Snowman applet to be stand-along application. 
//********************************************************************

/**
* SnowmanApplication - Creates a program that draws a snowman
* @author              Lewis/Loftus
* Modified:            David Ye Luo
* @version             1.0
* @since               2016-07-06
* Modified on adding extra features on the snowman
*/

/*
**********************Alogorithm**************************************
* Step 1: Create a frame
* Step 2: Create SnowmanPanel and add it to frame
* Step 3: Draw a snowman on SnowmanPanel
*         A: Draw background
*         B: Draw head
*         C: Draw body
*         D: Draw body parts and a hat
* Step 4: Modify the snowman
*         A: Add two RED buttons to the torso
*         B: Make the snowman frown
*         C: Move the sun to upper right corner
*         D: Add my name to upper left corner
*         E: Shift the snowman 20 pixels to the right
**********************************************************************
*/
import javax.swing.*;
import java.awt.*;
public class SnowmanApplication
{

    /**
    * Where codes are exectuted at
    * @param args A string array
    * containing the command line arguments.
    * @return No return value
    */
    public static void main (String [] args)
    {
        JFrame frame = new JFrame("Snowman Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SnowmanPanel panel = new SnowmanPanel();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
      
        
//********************************************************************
//  SnowmanPanel class used for drawing shapes 
//********************************************************************
/**
 * SnowmanPanel - Creates a panel used for drawing snowman
 *                See driver class for algorithm
 * @author        Lewis/Loftus
 * Modified       David Ye Luo
 * @version       1.0
 * @since         2016-09-07
*/

class SnowmanPanel extends JPanel
{

    //-----------------------------------------------------------------
    //  Constructor sets size and color of panel
    //-----------------------------------------------------------------
    public SnowmanPanel()
    {
        setPreferredSize(new Dimension(300,225));
        setBackground(Color.cyan);
    }
     
    //-----------------------------------------------------------------
    //  Draws a snowman.
    //-----------------------------------------------------------------
    /**
    * Draws snowman on the panel
    * @param page A graphics object to be drawn at
    * @return No return value
    */
   public void paintComponent (Graphics page)
    {
        super.paintComponent(page);
        final int MID = 150;
        final int TOP = 50;
        final int SHIFT = 20;

        setBackground (Color.cyan);

        page.setColor (Color.blue);
        page.fillRect (0, 175, 300, 50);  // ground

        page.setColor (Color.yellow);
        page.fillOval (300-40, -40, 80, 80);  // sun

        page.setColor (Color.white);
        page.fillOval (MID-20+SHIFT, TOP, 40, 40);      // head
        page.fillOval (MID-35+SHIFT, TOP+35, 70, 50);   // upper torso
        page.fillOval (MID-50+SHIFT, TOP+80, 100, 60);  // lower torso

        page.setColor (Color.black);
        page.fillOval (MID-10+SHIFT, TOP+10, 5, 5);   // left eye
        page.fillOval (MID+5+SHIFT, TOP+10, 5, 5);    // right eye

        page.drawArc (MID-10+SHIFT, TOP+20, 20, 10, -190, -160);   // frown

        page.drawLine (MID-25+SHIFT, TOP+60, MID-50+SHIFT, TOP+40);  // left arm
        page.drawLine (MID+25+SHIFT, TOP+60, MID+55+SHIFT, TOP+60);  // right arm

        page.drawLine (MID-20+SHIFT, TOP+5, MID+20+SHIFT, TOP+5);  // brim of hat
        page.fillRect (MID-15+SHIFT, TOP-20, 30, 25);        // top of hat
        
        page.setColor (Color.red);
        page.fillOval (MID-5+SHIFT, TOP+50, 10, 10);  // first button
        page.fillOval (MID-5+SHIFT, TOP+65, 10, 10);  // second button

        page.drawString("By David Ye Luo", 0, 10);  // name
    }
}