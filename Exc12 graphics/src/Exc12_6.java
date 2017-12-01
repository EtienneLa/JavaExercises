import java.awt.*;
import java.awt.Polygon;
import javax.swing.JFrame;
import java.util.Random;

public class Exc12_6 extends Canvas{

    public void paint(Graphics g){

        Random rng = new Random();

        for(int i = 1; i<500;i++){

            int x1 = rng.nextInt(801), x2 = rng.nextInt(801), x3 = rng.nextInt(801),
                y1 = rng.nextInt(601), y2 = rng.nextInt(601), y3 = rng.nextInt(601);
            int c1 = rng.nextInt(256), c2 = rng.nextInt(256), c3 = rng.nextInt(256);

            g.setColor(new Color(c1,c2,c3));

            Polygon tri = new Polygon();
            tri.addPoint(x1, y1);
            tri.addPoint(x2, y2);
            tri.addPoint(x3, y3);
            g.fillPolygon(tri);
        }

    }

    public static void main(String[]args){

        JFrame win = new JFrame();
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Exc12_6 canvas = new Exc12_6();
        win.add(canvas);
        win.setVisible(true);
    }

}
