
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Tree {
    public static void mainDraw(Graphics g) {
        g.setColor(Color.ORANGE);
        g.fillRect(0,0,WIDTH,HEIGHT);


        g.setColor(Color.BLACK);
        recursion(160,300,160, 250,g);
        drawOneLine(160,300, 160,250,g);


    }
    public static void drawOneLine (int xStart, int yStart, int xEnd, int yEnd, Graphics g) {
        int xVar = 20;
        int yVar = 30;
        int xNewStart = xEnd;
        int yNewStart = yEnd;
        int xNewEndLeft = xNewStart - xVar ;
        int xNewEndRight = xNewStart + xVar;
        int yNewEndMiddle = yEnd - yVar;
        int yNewEnd = yNewStart - yVar;

        g.drawLine(xStart,yStart,xEnd,yEnd);
        g.drawLine(xNewStart,yNewStart, xNewEndLeft, yNewEnd );
        g.drawLine(xNewStart,yNewStart, xNewEndRight, yNewEnd );
        g.drawLine(xNewStart,yNewStart, xEnd, yNewEndMiddle );



    }
    static void recursion (int xStart, int yStart, int xEnd, int yEnd, Graphics g) {
        drawOneLine(160,300, 160,250,g);
        if ( xEnd < 20) {
            int xVar = 20;
            int yVar = 30;
            int xNewStart = xEnd;
            int yNewStart = yEnd;
            int xNewEndLeft = xNewStart - xVar ;
            int xNewEndRight = xNewStart + xVar;
            int yNewEndMiddle = yEnd - yVar;
            int yNewEnd = yNewStart - yVar;

            recursion(xNewStart,yNewStart, xNewEndLeft, yNewEnd, g);
            recursion(xNewStart,yNewStart, xNewEndRight, yNewEnd, g );
            recursion(xNewStart,yNewStart, xEnd, yNewEndMiddle, g );

        }
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}