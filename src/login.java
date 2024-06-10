import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class login extends JFrame implements ActionListener {

    JButton signin,Clear,Signup;
    JTextField cardT;
    JPasswordField PinT;
    login()
    {
        setLayout(null);
        setTitle("BANK MANAGEMENT SYSTEM");
        setSize(800,500);
        setLocation(350,200);
        setVisible(true);
        String imagePath = "img\\bank.png";
        ImageIcon i1 = new ImageIcon(imagePath);
        setBackground(Color.WHITE);

        // Resize the image
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);


        // Create a label with the image
        JLabel label = new JLabel(i3);
        add(label);

        JLabel text = new JLabel("WElCOME TO ATM");
        text.setFont(new Font("Osward" ,Font.BOLD,38));
        text.setBounds(240,55,400,40);
        add(text);

        JLabel cardNo = new JLabel("Card No.:");
        cardNo.setFont(new Font("Raleway" ,Font.BOLD,28));
        cardNo.setBounds(120,150,250,40);
        add(cardNo);

        JLabel Pin = new JLabel("PIN:");
        Pin.setFont(new Font("Raleway" ,Font.BOLD,28));
        Pin.setBounds(120,220,250,40);
        add(Pin);

        cardT = new JTextField();
        cardT.setBounds(300,150,230,30);
        cardT.setFont(new Font("Arial",Font.BOLD,15) );

        add(cardT);

        PinT = new JPasswordField();
        PinT.setBounds(300,220,230,30);
        PinT.setFont(new Font("Arial",Font.BOLD,15));
        add(PinT);

        signin = new JButton("SIGN IN");
        signin.setBounds(300,300,100,30);
        signin.setBackground(Color.BLACK);
        signin.setForeground(Color.WHITE);
        signin.addActionListener(this);
        add(signin);

        Clear = new JButton("Clear");
        Clear.setBounds(430,300,100,30);
        Clear.setBackground(Color.BLACK);
        Clear.setForeground(Color.WHITE);
        Clear.addActionListener(this);
        add(Clear);

        getContentPane().setBackground(Color.WHITE);

        Signup = new JButton("Sign Up");
        Signup.setBounds(300,350,230,30);
        Signup.setBackground(Color.BLACK);
        Signup.setForeground(Color.WHITE);
        Signup.addActionListener(this);
        add(Signup);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==signin)
        {

        }
        else if(ae.getSource()==Clear)
        {
            cardT.setText("");
            PinT.setText("");

        }

        else if(ae.getSource()==Signup)
        {
            setVisible(false);
            new sighup().setVisible(true);
        }
    }
    public static void main(String[] args) {
        new login();
    }
}