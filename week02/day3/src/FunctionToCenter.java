
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.
        graphics.setColor(Color.BLUE);

        int x1 = 0;
        int y1 = 0;

        graphics.drawRect(0,0,320,320);

        for( int i = 0; i < 17; i++) {
            drawOneLine(x1 + (i*20),y1, graphics);
            drawOneLine(x1,y1 + (i*20), graphics);
            drawOneLine(x1 + (i*20),y1 + 320, graphics);
            drawOneLine(x1 + 320,y1 + (i*20), graphics);
        }

    }

    public static void drawOneLine(int x1, int y1, Graphics graphics) {
        int c = 160;
        graphics.drawLine(x1, y1, c, c);



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