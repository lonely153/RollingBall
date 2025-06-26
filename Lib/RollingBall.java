package Lib;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class RollingBall extends JPanel{
    int x=100;
    int y=90;
    int startangle=0;
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawOval(x,y, 80, 80);
        g.fillArc(x, y, 80, 80, startangle, 180);
    }
}

