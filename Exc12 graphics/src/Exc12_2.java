import java.awt.*;
import javax.swing.JFrame;

public class Exc12_2 extends Canvas{

    public void paint (Graphics g){

        g.setColor(Color.black);

        g.drawRect(50,20,100,200);
        g.drawOval(160,20,100,200);

        g.drawArc(270,20,100,200,0,270);
        g.drawArc(50,250,150,150,90,180);
        g.drawArc(210,250,150,150,45,90);
        g.fillArc(210,280,150,150,45,90);

        g.setColor(Color.yellow);
        g.fillArc(150,400,150,150,45,270);
        g.setColor(Color.pink);
        g.fillArc(300,400,150,150,225,270);

        Color myViolet = new Color(150,0,175);

        g.setColor(myViolet);
        g.fillOval(500,50,150,150);

        Color myOrange = new Color(210,85,0);

        g.setColor(myOrange);
        g.fillOval(550,100,50,50);

    }

    public static void main(String[]args){

        JFrame win = new JFrame("This is a title");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Exc12_2 canvas = new Exc12_2();
        win.add( canvas );
        win.setVisible(true);

    }
}
