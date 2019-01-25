



// for( int i = 0; i <= 20; i++ ) {

//   for( int j = 0; j <= 20 -i;  j++ ) {
//     graphics.drawLine(x,y,x2,y);



import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {

        int x = 160;
        int y = 0;
        int x2 = 160;
        int y2 = 10;

        graphics.drawLine(x,y,x2-5,y2);
        graphics.drawLine(x,y,x2 + 5, y2);
        graphics.drawLine(x2-5, 10, x2 + 5, y2);

        //graphics.drawLine();


        /*int xy = 0;
        int size = WIDTH / 8;*/

        /*for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                graphics.setColor(Color.BLACK);
                if (i % 2 ==0 && j % 2 ==0) {
                    graphics.drawLine(j * x, y, x2, y);
                }else if (i % 2 !=0 && j % 2 !=0) {
                    graphics.drawLine(j * x, y, x2, y);
                }


            }
        }*/
        /*int x = 160;
        int y = 20;
        int x2 = 180;

        for( int column = 0; column < 10; column++ ) {
            for( int row = 0; row < 10; row++ ) {
                graphics.drawLine(x, y, x2, y);
                x +=10;
                y += 20;
                x2 += 10;




            }
            //for( int k = 0; k <= i; k++ ) {

        }*/

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