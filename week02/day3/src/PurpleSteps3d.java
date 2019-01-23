import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {
    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps-3d/r4.png]

        int xy = 0;
        int size = 10;
        graphics.setColor(new Color(164, 66, 244));
        for( int i = 0; i < 6; i++ ) {
            size +=10;
           graphics.fillRect(xy + (i * size - size),xy +(i * size - size),size ,size);
           //graphics.fillRect(xy + (i + bigger), xy + (i + bigger), size ,size);

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