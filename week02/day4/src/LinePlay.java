
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics) {

        graphics.setColor(new Color(161, 66, 244));
       // graphics.drawLine(40,0,320,20);
        int x = 40;
        int y =0;
        int x2 = 320;
        int y2 = 20;
        for( int i = 0; i < 14; i++ ) {
            graphics.drawLine(x,y,x2,y2);
            x += 20;
            y2 += 20;

        }

        graphics.setColor(Color.GREEN);
        //graphics.drawLine(0,40,20,320);
        x = 0;
        y = 40;
        x2 = 20;
        y2 = 320;

        for( int i = 0; i < 14; i++ ) {
            graphics.drawLine(x,y,x2,y2);
            y += 20;
            x2 += 20;

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