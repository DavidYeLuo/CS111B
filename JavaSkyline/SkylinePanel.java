/**
 * SkylinePanel --- program to draw buildings
 * @author          Lewis/Loftus, modified by David Ye Luo
 * @version         1.0
 * @since           2016-09-27 
*/

import javax.swing.*;
import java.awt.*;
import java.lang.*;

public class SkylinePanel extends JPanel
{
   private Building building1, building2;
   private Building building3, building4;
   private Building building5, building6;
   //-------------------------------------------------
   //   Default Constructor: Sets up the Panel
   //-------------------------------------------------
   public SkylinePanel()
   {  
      building1 = new Building(10, 380, new Color(5,5,5), 100, 50);
      building2 = new Building(120, 380, new Color(5,5,5), 50, 75);
      building3 = new Building(230, 380, new Color(5,5,5), 70, 150);
      building4 = new Building(340, 380, new Color(5,5,5), 45, 100);
      building5 = new Building(400, 380, new Color(5,5,5), 100, 185);
      building6 = new Building(510, 380, new Color(5,5,5), 80, 65);
      
      System.out.println(building1);
      setPreferredSize (new Dimension(600, 400));
      setBackground (new Color(0,0,20));
   }
   //-------------------------------------------------
   //   Draws the Panel
   //-------------------------------------------------
   public void paintComponent (Graphics page)
   {
      super.paintComponent(page);
      
      page.setColor(Color.lightGray);  // moon
      page.fillOval(50,70,40,40);      // moon
      
      page.setColor(new Color(10,10,10));   // far background building
      page.fillRect(0,340,600,60);          // far background building
      for(int i = 0; i < 40; i++){
         page.fillRect((int)(Math.random()*680-40)  // far background building
                      ,(int)(Math.random()*40+305)  // far background building
                      ,(int)(Math.random()*20+20)   // far background building
                      ,40);                         // far background building
      }
      
      page.setColor(new Color(7,7,7));      // close background building
      page.fillRect(0,360,600,20);          // close background building
      for(int i = 0; i < 40; i++){
         page.fillRect((int)(Math.random()*680-40)  // close background building
                      ,(int)(Math.random()*20+345)  // close background building
                      ,(int)(Math.random()*20+20)   // close background building
                      ,60);                         // close background building
      }
      
      page.setColor(new Color(5,5,5));  // building color
      page.fillRect(0,380,600,20);      // ground
      building1.draw(page);
      building2.draw(page);
      building3.draw(page);
      building4.draw(page);
      building5.draw(page);
      //building6.draw(page);  //the 6th building had to be removed, per assignment restrictions. *weep weep*
      
      page.setColor (Color.white);  // string color
      page.drawString("David Ye Luo and Kenta Medina's Skyline with windows", 30, 30); // draw string
   }
}