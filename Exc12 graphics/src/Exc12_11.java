import java.awt.*;
import javax.swing.JFrame;

public class Exc12_11 extends Canvas {

    public void paint ( Graphics g ) {

        drawSmilingFace( g, 100, 100 );
        drawSmilingFace( g, 400, 350 );
        drawSmilingFace( g, 700, 600 );
    }

    public void drawSmilingFace( Graphics g, int x, int y ){

        g.setColor( Color.yellow );
        g.fillOval( x, y, 200, 200 );
        g.setColor( Color.blue );
        g.fillOval( x + 50, y + 50, 35, 35 );
        g.fillOval( x + 115, y + 50, 35, 35 );
        g.setColor( Color.black );
        g.drawArc( x + 10, y + 10, 180, 180, 0, -180 );
    }

    public static void main( String [] args ){

        Canvas canvas = new Exc12_11();
        JFrame win = new JFrame( "SmilingFaces" );
        canvas.setBackground( Color.black );
        win.setSize( 1024, 768 );
        win.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        win.add( canvas );
        win.setVisible( true );
    }
}
