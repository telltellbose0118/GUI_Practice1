package Practice1;

import javax.swing.*;
import java.awt.*;
import java.util.Collections;
import java.util.Objects;

/**
 * Created by Tatsuki on 9/8/15.
 */
public class Practice1 {
    private static void createAndShowGUI(){
        JFrame fr = new JFrame("GUI");
        fr.setDefaultCloseOperation(3);
        fr.setVisible(true);
        fr.setSize(400, 400);
        fr.setLocationRelativeTo(null);
        fr.getContentPane().add(new MyPanel());
    }
    private static class MyPanel extends JPanel{
        @Override
        protected void paintComponent(Graphics g) {
            g.setColor(Color.white);
            g.fillRect(this.getX(), this.getY(), getWidth(), getHeight());
            Graphics2D g2d = (Graphics2D)g.create();
            g2d.setPaint(new GradientPaint(0f,0f,Color.GRAY.brighter(),0f,400f,Color.GRAY.darker()));
            g2d.fillRect(0,0,getWidth(),getHeight()*4/5);
            g2d.dispose();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater( () -> createAndShowGUI());
    }
}
