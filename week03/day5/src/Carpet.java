
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Carpet {
    public static void mainDraw(Graphics g) {
        int sizeOfBox = WIDTH;
        g.setColor(Color.BLACK);
        recursion(0,0,sizeOfBox,g);
        //drawRects(0,0,sizeOfBox,g);

    }
    public static void drawRects (int xStart, int yStart, int sizeOfBox, Graphics g) {
        int thirdOfWidt = sizeOfBox/3;
        g.fillRect(xStart + thirdOfWidt, yStart + thirdOfWidt, thirdOfWidt,thirdOfWidt);
    }
    static void recursion (int xStart, int yStart, int sizeOfBox, Graphics g) {
        int thirdOfWidth = sizeOfBox/3;
        drawRects(xStart,yStart,sizeOfBox,g);
        if (sizeOfBox > 20) {

            recursion(xStart, yStart, thirdOfWidth, g);
            recursion(xStart + 2 * thirdOfWidth, yStart, thirdOfWidth, g);
            recursion(xStart, yStart+ 2 * thirdOfWidth, thirdOfWidth, g);
            recursion(xStart + 2 * thirdOfWidth, yStart + 2 * thirdOfWidth, thirdOfWidth, g);

            recursion(xStart + thirdOfWidth, yStart, thirdOfWidth, g);
            recursion(xStart, yStart + thirdOfWidth, thirdOfWidth, g);
            recursion(xStart + 2 * thirdOfWidth, yStart + thirdOfWidth, thirdOfWidth, g);
            recursion(xStart + thirdOfWidth, yStart + 2 * thirdOfWidth, thirdOfWidth, g);
            recursion(xStart + thirdOfWidth, yStart + thirdOfWidth, thirdOfWidth,g);


        }
    }

    // Don't touch the code below
    static int WIDTH = 729;
    static int HEIGHT = 729;

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