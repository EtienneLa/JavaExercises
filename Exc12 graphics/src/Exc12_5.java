import java.awt.*;
import javax.swing.JFrame;

public class Exc12_5 extends Canvas{

    public void paint (Graphics g){

        g.setColor(Color.yellow);
        g.fillArc(250,150,300,300,0,360);
        g.setColor(Color.red);
        g.fillArc(330,230,50,50,0,360);
        g.fillArc(420,230,50,50,0,360);
        g.setColor(Color.blue);
        g.drawArc(350,350,100,100,45,90);


    }
    public static void main(String[]args){

        JFrame win = new JFrame("Sad Face");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Exc12_5 canvas = new Exc12_5();
        win.add(canvas);
        win.setVisible(true);
    }
}
