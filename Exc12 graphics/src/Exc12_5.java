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



        g.setColor(Color.black);
        g.setFont(new Font(null));
        for ( int X=0; X<800; X += 50 )
            g.drawString( String.valueOf(X), X, 50 );
        for ( int Y=100; Y<600; Y += 50 )
            g.drawString( String.valueOf(Y), 28, Y );

        g.setColor(Color.lightGray);
        for ( int X=0; X<800; X += 50 )
            g.drawLine(X,0,X,599);
        for ( int Y=0; Y<600; Y += 50 )
            g.drawLine(0,Y,799,Y);
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
