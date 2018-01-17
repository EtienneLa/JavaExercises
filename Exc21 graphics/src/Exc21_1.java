import java.awt.*;
import javax.swing.JFrame;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class Exc21_1 extends Canvas implements MouseListener
{
    private Color curColor;
    private String curMessage;

    public Exc21_1()
    {
        addMouseListener(this);

        curColor = Color.red;
        curMessage = "The square is red.";
    }

    public void paint( Graphics g )
    {
        g.setColor(Color.black);
        g.setFont(Font.decode("Calibri-BOLD-24"));
        g.drawString(curMessage, 400, 100);

        g.setColor(curColor);
        g.fillRect(250,100,100,100);
    }

    public void mouseClicked( MouseEvent evt )
    {
        System.out.println("You clicked at (" + evt.getX() + "," + evt.getY() + ")");

        curMessage = "The square is green.";

        curColor = Color.green;

        repaint();
    }

    public void mousePressed( MouseEvent evt )
    {
        curColor = Color.black;

        repaint();
    }

    public void mouseReleased( MouseEvent evt )
    {
        curColor = Color.pink;

        repaint();
    }

    public void mouseEntered( MouseEvent evt )
    {
        curColor = Color.orange;

        repaint();
    }

    public void mouseExited( MouseEvent evt )
    {
        curColor = Color.white;

        repaint();
    }

    public static void main(String[] args)
    {
        JFrame win = new JFrame("Exc21_1");
        win.setSize(1024,768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add( new Exc21_1() );
        win.setVisible(true);
    }


}