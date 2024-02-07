import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 class Calculator implements ActionListener{
        JFrame jf;
        JTextField jt;
        JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,bsub,bmul,bdiv,bc,b0,b17,badd,beq,bdot;
        JLabel jl;
        float oprand1,oprand2;
        int oprt;
        Calculator(){
            jf = new JFrame("Calculator");
            jf.setLayout(null);
            jf.setSize(300,500);
            jl = new JLabel("Calculator");
            jl.setBounds(100,50,100,20);
            jf.add(jl);
            jt = new JTextField();
            jt.setBounds(50,90,200,30);
            jf.add(jt);
            bc = new JButton("C");
            bc.setBounds(50,130,50,50);
            bc.addActionListener(this);
            jf.add(bc);
            bdiv = new JButton("/");
            bdiv.setBounds(100,130,50,50);
            bdiv.addActionListener(this);
            jf.add(bdiv);
            bmul = new JButton("X");
            bmul.setBounds(150,130,50,50);
            bmul.addActionListener(this);
            jf.add(bmul);
            bsub = new JButton("-");
            bsub.setBounds(200,130,50,50);
            bsub.addActionListener(this);
            jf.add(bsub);
            b7 = new JButton("7");
            b7.setBounds(50,180,50,50);
            b7.addActionListener(this);
            jf.add(b7);
            b8 = new JButton("8");
            b8.setBounds(100,180,50,50);
            b8.addActionListener(this);
            jf.add(b8);
            b9 = new JButton("9");
            b9.setBounds(150,180,50,50);
            b9.addActionListener(this);
            jf.add(b9);
            badd = new JButton("+");
            badd.setBounds(200,180,50,100);
            badd.addActionListener(this);
            jf.add(badd);
            b4 = new JButton("4");
            b4.setBounds(50,230,50,50);
            b4.addActionListener(this);
            jf.add(b4);
            b5 = new JButton("5");
            b5.setBounds(100,230,50,50);
            b5.addActionListener(this);
            jf.add(b5);
            b6 = new JButton("6");
            b6.setBounds(150,230,50,50);
            b6.addActionListener(this);
            jf.add(b6);
            b1 = new JButton("1");
            b1.setBounds(50,280,50,50);
            b1.addActionListener(this);
            jf.add(b1);
            b2 = new JButton("2");
            b2.setBounds(100,280,50,50);
            b2.addActionListener(this);
            jf.add(b2);
            b3 = new JButton("3");
            b3.setBounds(150,280,50,50);
            b3.addActionListener(this);
            jf.add(b3);
            beq = new JButton("=");
            beq.setBounds(200,280,50,100);
            beq.addActionListener(this);
            jf.add(beq);
            b0 = new JButton("0");
            b0.setBounds(50,330,100,50);
            b0.addActionListener(this);
            jf.add(b0);
            bdot = new JButton(".");
            bdot.setBounds(150,330,50,50);
            bdot.addActionListener(this);
            jf.add(bdot);
            jf.setVisible(true);
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);}
    public void actionPerformed(ActionEvent ae){
        String temp;
        String source = ae.getActionCommand();
        if(source == "C")jt.setText("");
        else if(source == "."){
            temp = jt.getText();
            jt.setText(temp+".");
        }
        else if(source == "+"){
            oprand1 = Float.parseFloat(jt.getText());
            System.out.println(oprand1);
            oprt = 0;
            jt.setText("");
        }
        else if(source == "-"){
            oprand1 = Float.parseFloat(jt.getText());
            oprt = 1;
            jt.setText("");
        }
        else if(source == "X"){
            oprand1 = Float.parseFloat(jt.getText());
            oprt = 2;
            jt.setText("");
        }
        else if(source == "/"){
            oprand1 = Float.parseFloat(jt.getText());
            oprt = 3;
            jt.setText("");
        }
        else if (source=="="){
            oprand2 = Float.parseFloat(jt.getText());
            if(oprt==0)jt.setText(Float.toString((oprand1+oprand2)));
            else if(oprt==1)jt.setText(Float.toString((oprand1-oprand2)));
            else if(oprt==2)jt.setText(Float.toString((oprand1*oprand2)));
            else if(oprt==3)jt.setText(Float.toString((oprand1/oprand2)));
        }
        else if(0<=Integer.parseInt(source)&&9>=Integer.parseInt(source)){
            temp=jt.getText();
            jt.setText(temp+source);
        }  
    }
}
class calculator
{
    public static void main(String args[])
    {
        Calculator calc = new Calculator();
    }
}


