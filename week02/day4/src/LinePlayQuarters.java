
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
    public static void mainDraw(Graphics g) {
        int lines = 14;
        int divide = 1;
        int width = WIDTH / divide;
        int height = HEIGHT / divide;
        int offsetX = 0;
        for( int i = 0; i < divide ; i++ ) {

            drawLine(divide,g, lines, width, height, offsetX);
            offsetX += width;
        }
    }
    public static void drawLine (int divide, Graphics g, int lines, int width, int height, int offsetX) {
        int startingPointX = (40 / divide) + offsetX;
        int startingPointY = 40 / divide;
        int endingPiontX = 0 + offsetX;
        int difference = height / lines -1;
        int endingPointY = difference;


        for( int i = 0; i < lines ; i++ ) {
            g.setColor(new Color(161, 66, 244));
            g.drawLine(startingPointX , 0,width + offsetX,endingPointY);
            startingPointX += difference;
            endingPointY += difference;
            g.setColor(Color.GREEN);
            g.drawLine(0 + offsetX, startingPointY, endingPiontX, height);
            startingPointY += difference;
            endingPiontX += difference;

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