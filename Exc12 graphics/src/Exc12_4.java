import java.awt.*;
import javax.swing.JFrame;

public class Exc12_4 extends Canvas{

    public void paint(Graphics g){

        g.setColor(Color.green);
        g.fillArc(150,50,300,300,0,360);
    }

    public static void main(String[]args){

        JFrame win = new JFrame("green circle");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Exc12_4 canvas = new Exc12_4();
        win.add(canvas);
        win.setVisible(true);
    }
}
