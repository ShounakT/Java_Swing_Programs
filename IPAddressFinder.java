package SimpleGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.UnknownHostException;

public class IPAddressFinder extends Component {
    public static void main(String[] args) {

        JFrame f= new JFrame("IP Address Info");
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

        JTextField tf = new JTextField();
        tf.setBounds(50,100,200,30);

        JLabel l = new JLabel("Enter the URL here:");
        l.setBounds(50,50,200,30);

        JButton b = new JButton("Find IP");
        b.setBounds(50,150,95,30);

        JOptionPane jp = new JOptionPane();


        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String web = tf.getText().trim();
                String ip = null;
                try {
                    ip = java.net.InetAddress.getByName(web).getHostAddress();
                } catch (UnknownHostException unknownHostException) {
                    unknownHostException.printStackTrace();
                }
                JOptionPane.showMessageDialog(null,"IP of "+web+" is: "+ip);
            }
        });

        f.add(tf);
        f.add(l);
        f.add(b);

        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
