/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcacnj
 */
import java.awt.*;
import java.applet.Applet;
public class Call extends Applet{
    Font bigFront;
    Color redColor;
    Color wiredColor;
    Color bgColor;
    
    public void init()
    {
      bigFront=new Font("Arial",Font.BOLD,16);
       redColor=Color.RED;
       wiredColor=new Color(60,60,122);
       bgColor=Color.YELLOW;
       setBackground(bgColor);
    }
    int x=300,y=100,r=50;
    public void paint(Graphics g)
    {
        g.drawLine(30, 300, 200, 10);
        g.drawOval(x-r, y-r, 100, 100);
        g.drawRect(400, 50, 200, 100);
        g.drawString("Hello World", 50, 25);
    }
    
}
