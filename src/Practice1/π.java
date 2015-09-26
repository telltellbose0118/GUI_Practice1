package Practice1;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Area;
import java.awt.geom.Dimension2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tatsuki on 2015/09/22.
 */
public class π {
    private static List<Shape> shapes = new ArrayList<>();
    private static int counter = 0;
    private static Point2D center = new Point2D.Float(250,250);

    private static class Calculater extends Thread {
        @Override
        public void run() {

        }
    }
    private static class GUI extends JComponent{
        @Override
        protected void paintComponent(Graphics g) {
            setBackground(Color.white);
            g.clearRect(0, 0, getWidth(), getHeight());
            g.setColor(Color.black);
            Graphics2D g2d = (Graphics2D)g;
            g2d.draw(new Ellipse2D.Float((float)center.getX()-100,(float)center.getY()-100,100,100));
        }
    }
    private static Shape createShapes(int n){

        return new Area();
    }
    private static void createAndShowGUI(){
        JFrame frame = new JFrame("π");
        frame.add(new GUI());
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setSize(500,700);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }
}
