package SimpleGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingCalculator implements ActionListener {

    JFrame f;
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,beq,bclr,ba,bs,bd,bm;
    JTextField scr;
    JRadioButton on,off;
    String text;
    static int a=0,b=0,operator=0;
    static double result=0;

    public static void main(String[] args) {
        new SwingCalculator();
    }

    SwingCalculator(){
        f = new JFrame("Calculator");
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
        f.setResizable(true);
        f.setBackground(Color.gray);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ButtonGroup bg = new ButtonGroup();
        on = new JRadioButton("ON");
        on.setSelected(true);
        on.setBounds(50,35,20,30);
        JLabel onlbl = new JLabel("ON");
        onlbl.setBounds(80,34,20,30);
        off = new JRadioButton("OFF");
        off.setBounds(120,35,20,30);
        off.setSelected(false);
        JLabel offlbl = new JLabel("OFF");
        offlbl.setBounds(150,34,25,30);
        scr = new JTextField();
        scr.setBounds(50,75,230,40);
        scr.setBackground(Color.PINK);
        scr.setEditable(false);
        b1 = new JButton("1");
        b1.setBounds(50,150,50,40);
        b2 = new JButton("2");
        b2.setBounds(110,150,50,40);
        b3 = new JButton("3");
        b3.setBounds(170,150,50,40);
        ba = new JButton("+");
        ba.setBounds(230,150,50,40);
        b4 = new JButton("4");
        b4.setBounds(50,210,50,40);
        b5 = new JButton("5");
        b5.setBounds(110,210,50,40);
        b6 = new JButton("6");
        b6.setBounds(170,210,50,40);
        bs = new JButton("-");
        bs.setBounds(230,210,50,40);
        b7 = new JButton("7");
        b7.setBounds(50,270,50,40);
        b8 = new JButton("8");
        b8.setBounds(110,270,50,40);
        b9 = new JButton("9");
        b9.setBounds(170,270,50,40);
        bm = new JButton("*");
        bm.setBounds(230,270,50,40);
        b0 = new JButton("0");
        b0.setBounds(50,330,50,40);
        bclr = new JButton("C");
        bclr.setBounds(110,330,50,40);
        beq = new JButton("=");
        beq.setBounds(170,330,50,40);
        bd = new JButton("/");
        bd.setBounds(230,330,50,40);
        bg.add(on);
        bg.add(off);
        f.add(scr);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(ba);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(bs);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(bm);
        f.add(b0);
        f.add(bclr);
        f.add(beq);
        f.add(bd);
        f.add(on);
        f.add(off);
        f.add(onlbl);
        f.add(offlbl);
        scr.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        ba.addActionListener(this);
        bs.addActionListener(this);
        bm.addActionListener(this);
        bd.addActionListener(this);
        bclr.addActionListener(this);
        beq.addActionListener(this);
        b0.addActionListener(this);
        on.addActionListener(this);
        off.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == on){
            scr.setVisible(true);
        }
        if(e.getSource() == off){
            scr.setVisible(false);
        }
        if(e.getSource() == bclr){
            scr.setText(null);
        }
        if(e.getSource() == b1){
            scr.setText(scr.getText().trim().concat("1"));
        }
        if(e.getSource() == b2){
        scr.setText(scr.getText().trim().concat("2"));
        }
        if(e.getSource() == b3){
            scr.setText(scr.getText().trim().concat("3"));
        }
        if(e.getSource() == b4){
            scr.setText(scr.getText().trim().concat("4"));
        }
        if(e.getSource() == b5){
            scr.setText(scr.getText().trim().concat("5"));
        }
        if(e.getSource() == b6){
            scr.setText(scr.getText().trim().concat("6"));
        }
        if(e.getSource() == b7){
            scr.setText(scr.getText().trim().concat("7"));
        }
        if(e.getSource() == b8){
            scr.setText(scr.getText().trim().concat("8"));
        }
        if(e.getSource() == b9){
            scr.setText(scr.getText().trim().concat("9"));
        }
        if(e.getSource() == b0){
            scr.setText(scr.getText().trim().concat("0"));
        }
        if(e.getSource() == ba){
            scr.setText(scr.getText().trim().concat("+"));
            operator = 1;
        }
        if(e.getSource() == bs){
            scr.setText(scr.getText().trim().concat("-"));
            operator = 2;
        }
        if(e.getSource() == bm){
            scr.setText(scr.getText().trim().concat("*"));
            operator = 3;
        }
        if(e.getSource() == bd){
            scr.setText(scr.getText().trim().concat("/"));
            operator = 4;
        }
        if(e.getSource() == beq){
            text = scr.getText().trim();
            int plus  = text.indexOf("+");
            int minus = text.indexOf("-");
            int mult  = text.indexOf("*");
            int div   = text.indexOf("/");

            switch(operator){
                case 1:
                    a = Integer.parseInt(text.substring(0,plus));
                    b = Integer.parseInt(text.substring(plus+1));
                    result =(double) a + b;
                    scr.setText(String.valueOf(result));
                    break;
                case 2:
                    a = Integer.parseInt(text.substring(0,minus));
                    b = Integer.parseInt(text.substring(minus+1));
                    result =(double) a - b;
                    scr.setText(String.valueOf(result));
                    break;
                case 3:
                    a = Integer.parseInt(text.substring(0,mult));
                    b = Integer.parseInt(text.substring(mult+1));
                    result =(double) a * b;
                    scr.setText(String.valueOf(result));
                    break;
                case 4:
                    a = Integer.parseInt(text.substring(0,div));
                    b = Integer.parseInt(text.substring(div+1));
                    try{result = (double) a / b;
                        scr.setText(String.valueOf(result));
                    }catch(Exception k){scr.setText("DivideByZeroError");}
                    break;
                default:
                    scr.setText("Error");
            }
        }


    }
}
