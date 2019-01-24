
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
    public static void mainDraw(Graphics graphics) {
        //1A
        graphics.setColor(new Color(161, 66, 244));
        // graphics.drawLine(40,0,320,20);
        int x = 20;
        int y =0;
        int x2 = 160;
        int y2 = 10;
        int step = 10;
        for( int i = 0; i < 14; i++ ) {
            graphics.drawLine(x,y,x2,y2);
            x += step;
            y2 += step;

        }
        //1B
        graphics.setColor(Color.GREEN);
        //graphics.drawLine(0,40,20,320);
        x = 0;
        y = 20;
        x2 = 10;
        y2 = 160;

        for( int i = 0; i < 14; i++ ) {
            graphics.drawLine(x,y,x2,y2);
            y += step;
            x2 += step;

        }
        //2A
        graphics.setColor(new Color(161, 66, 244));
        // graphics.drawLine(40,0,320,20);
         x = 180;
         y =0;
         x2 = 320;
         y2 = 10;

        for( int i = 0; i < 14; i++ ) {
            graphics.drawLine(x,y,x2,y2);
            x += step;
            y2 += step;

        }
        //2B
        graphics.setColor(Color.GREEN);
        //graphics.drawLine(0,40,20,320);
        x = 160;
        y = 20;
        x2 = 170;
        y2 = 160;

        for( int i = 0; i < 14; i++ ) {
            graphics.drawLine(x,y,x2,y2);
            y += step;
            x2 += step;

        }
        //3A
        graphics.setColor(new Color(161, 66, 244));
        // graphics.drawLine(40,0,320,20);
        x = 20;
        y =160;
        x2 = 160;
        y2 = 170;

        for( int i = 0; i < 14; i++ ) {
            graphics.drawLine(x,y,x2,y2);
            x += step;
            y2 += step;

        }
        //3B
        graphics.setColor(Color.GREEN);
        //graphics.drawLine(0,40,20,320);
        x = 0;
        y = 180;
        x2 = 10;
        y2 = 320;

        for( int i = 0; i < 14; i++ ) {
            graphics.drawLine(x,y,x2,y2);
            y += step;
            x2 += step;

        }

        //4A
        graphics.setColor(new Color(161, 66, 244));
        // graphics.drawLine(40,0,320,20);
        x = 180;
        y =160;
        x2 = 320;
        y2 = 170;

        for( int i = 0; i < 14; i++ ) {
            graphics.drawLine(x,y,x2,y2);
            x += step;
            y2 += step;

        }
        //4B
        graphics.setColor(Color.GREEN);
        //graphics.drawLine(0,40,20,320);
        x = 160;
        y = 170;
        x2 = 170;
        y2 = 320;

        for( int i = 0; i < 14; i++ ) {
            graphics.drawLine(x,y,x2,y2);
            y += step;
            x2 += step;

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