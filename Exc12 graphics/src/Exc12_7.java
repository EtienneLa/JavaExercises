import java.awt.*;
import java.awt.Polygon;
import javax.swing.JFrame;
import java.util.Random;

public class Exc12_7 extends Canvas{

    public void paint(Graphics g){

        Random rng = new Random();

        for(int i = 1; i<500;i++){

            int x1 = rng.nextInt(751), y1 = rng.nextInt(551);
            int c1 = rng.nextInt(256), c2 = rng.nextInt(256), c3 = rng.nextInt(256);

            g.setColor(new Color(c1,c2,c3));

            Polygon tri = new Polygon();
            tri.addPoint(x1, y1);
            tri.addPoint(x1, y1+50);
            tri.addPoint(x1+50, y1+50);
            g.fillPolygon(tri);
        }

    }

    public static void main(String[]args){

        JFrame win = new JFrame();
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Exc12_7 canvas = new Exc12_7();
        win.add(canvas);
        win.setVisible(true);
    }

}