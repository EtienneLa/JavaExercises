import java.awt.*;
import javax.swing.JFrame;

public class Exc12_1 extends Canvas{

    public void paint ( Graphics g){

        g.setColor(Color.red);
        g.drawRect(50,20,100,200);
        g.fillOval(160,20,100,200);
        g.setColor(Color.gray);
        g.fillRect(200,400,200,20);
        g.drawOval(200,430,200,100);

        g.setColor(Color.green);
        g.drawString("I'm drawing a great String!", 500, 200);
        int x = getWidth() / 2;
        int y = getHeight() / 2;
        g.drawString("The first letter of this string is at (" + x + "," + y + ")", x, y);
    }

    public static void main(String []args){

        JFrame win = new JFrame("GraphicsDemo");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Exc12_1 canvas = new Exc12_1();
        win.add( canvas );
        win.setVisible(true);
    }
}