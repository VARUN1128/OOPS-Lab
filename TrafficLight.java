import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class Trafic extends JPanel implements ActionListener{
    JRadioButton r1,r2,r3;
    Color red_c,yellow_c,green_c;
    Trafic()
    {
        setBounds(0,0,400,400);
        
        red_c = getBackground();
        yellow_c = getBackground();
        green_c = getBackground();

        r1 = new JRadioButton("Red");
        r2 = new JRadioButton("Yellow");
        r3 = new JRadioButton("Green");

        ButtonGroup gp = new ButtonGroup();
        gp.add(r1);
        gp.add(r2);
        gp.add(r3);

        add(r1);
        add(r2);
        add(r3);

        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);
    }
        
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawOval(200, 100, 50, 50);
        g.drawOval(200, 200, 50, 50);
        g.drawOval(200, 300, 50, 50);

        g.setColor(red_c);
        g.fillOval(200, 100, 50, 50);
        g.setColor(yellow_c);
        g.fillOval(200, 200, 50, 50);
        g.setColor(green_c);
        g.fillOval(200, 300, 50, 50);
    }

    public void actionPerformed(ActionEvent ae){
        if(r1.isSelected())
            {
                red_c = Color.red;
                yellow_c = getBackground();
                green_c = getBackground();
                repaint();
            }
        else if(r2.isSelected())
        {
            red_c = getBackground();
            yellow_c = Color.yellow;
            green_c = getBackground();
            repaint();
        }
        else if(r3.isSelected())
        {
            red_c = getBackground();
            yellow_c =getBackground();
            green_c = Color.green;
            repaint();
        }
    }
    
}
class TrafficLight{
    static JFrame jf;
    public static void main(String args[]){
        Trafic t = new Trafic();
        jf = new JFrame("Traffic Light");
        jf.setSize(500,500);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(t);
        jf.setVisible(true);
    }
}
