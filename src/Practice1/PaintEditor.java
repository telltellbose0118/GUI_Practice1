package Practice1;

import javafx.scene.paint.*;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Objects;

/**
 * Created by Tatsuki on 2015/09/25.
 */
public class PaintEditor extends JFrame{
    private static void createAndShowGUI(){
        Canvas canvas = new Canvas();
        JFrame frame = new PaintEditor();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.add(canvas);
        frame.addMouseListener(canvas);
        frame.addMouseMotionListener(canvas);
        System.out.println(frame.getLayout());
        Objects.requireNonNull(null);
    }
    private static class Canvas extends JComponent implements MouseInputListener{
        @Override
        protected void paintComponent(Graphics g) {
            g.setColor(Color.white);
            g.fillRect(0,0,getWidth(),getHeight());
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            Graphics2D g = (Graphics2D)getGraphics();
            g.setPaint(Color.black);
            g.fillRect(e.getX(), e.getY(), 10, 10);
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }

        @Override
        public void mouseDragged(MouseEvent e) {

        }

        @Override
        public void mouseMoved(MouseEvent e) {

        }

//        private class MouseListener extends MouseAdapter{
//            Graphics2D g = (Graphics2D)getGraphics();
//
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                g.setPaint(Color.black);
//                g.fillRect(e.getX(),e.getY(),10,10);
//            }
//        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

}
