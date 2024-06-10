import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class signupThree extends JFrame implements ActionListener {

    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit , cancel;
    signupThree()
    {
        setLayout(null);
        setSize(800,850);
        setLocation(350,20);
        setTitle("Third Page");

        JLabel ll = new JLabel("Page 3: Account Details ");
        ll.setFont(new Font("Raleway",Font.BOLD,38));
        ll.setBounds(240,40,600,40);
        add(ll);

        JLabel type = new JLabel("Account Type");
        ll.setFont(new Font("Raleway",Font.BOLD,22));
        ll.setBounds(100,140,400,30);
        add(type);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100,180,200,20);
        add(r1);

        r2 = new JRadioButton("Fixed Deposite Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350,180,300,20);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100,220,200,20);
        add(r3);

        r4 = new JRadioButton("Recurring Deposite Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350,220,300,20);
        add(r4);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        bg.add(r4);

        JLabel cardNumber = new JLabel("Card Number");
        cardNumber.setFont(new Font("Raleway",Font.BOLD,22));
        cardNumber.setBounds(100,300,600,30);
        add(cardNumber);

        JLabel num = new JLabel("XXXX-XXXX-XXXX-4104");
        num.setFont(new Font("Raleway",Font.BOLD,22));
        num.setBounds(300,300,600,40);
        add(num);


        JLabel pin = new JLabel("Pin");
        pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBounds(100,370,600,30);
        add(pin);

        JLabel Pnum = new JLabel("XXXX");
        Pnum.setFont(new Font("Raleway",Font.BOLD,22));
        Pnum.setBounds(330,370,600,40);
        add(Pnum);


        JLabel service = new JLabel("Service Required");
        service.setFont(new Font("Raleway",Font.BOLD,22));
        service.setBounds(100   ,450,600,40);
        add(service);

        c1 = new JCheckBox("ATM CARD");
        c1.setFont(new Font("Raleway",Font.BOLD , 16) );
        c1.setBackground(Color.WHITE);
        c1.setBounds(100,500,200,30);
        add(c1);


        c2 = new JCheckBox("Internet Banking");
        c2.setFont(new Font("Raleway",Font.BOLD , 16) );
        c2.setBackground(Color.WHITE);
        c2.setBounds(350,500,200,30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setFont(new Font("Raleway",Font.BOLD , 16) );
        c3.setBackground(Color.WHITE);
        c3.setBounds(100,550,200,30);
        add(c3);

        c4 = new JCheckBox("Email & SMS alert");
        c4.setFont(new Font("Raleway",Font.BOLD , 16) );
        c4.setBackground(Color.WHITE);
        c4.setBounds(350,550,200,30);
        add(c4);


        c5 = new JCheckBox("Cheque Book");
        c5.setFont(new Font("Raleway",Font.BOLD , 16) );
        c5.setBackground(Color.WHITE);
        c5.setBounds(100,600,200,30);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setFont(new Font("Raleway",Font.BOLD , 16) );
        c6.setBackground(Color.WHITE);
        c6.setBounds(350,600,200,30);
        add(c6);


        c7 = new JCheckBox("I hearby declare that the above entered details are correct ");
        c7.setFont(new Font("Raleway",Font.BOLD , 16) );
        c7.setBackground(Color.WHITE);
        c7.setBounds(100,680,600,30);
        add(c7);

        submit = new JButton("Submit");
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setBounds(420,720,100,30);
        submit.addActionListener(this);
        add(submit);

        cancel =new JButton("Cancel");
        cancel.setFont(new Font("Raleway",Font.BOLD , 14));
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.white);
        cancel.setBounds(420,720,100,30);
        cancel.addActionListener(this);
        add(cancel);

        getContentPane().setBackground(Color.white);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent aa)
    {

        if(aa.getSource()==submit)

        {
            String accT = null;

            if(r1.isSelected())
            {
                accT = "Saving Account";
            }
            else if(r3.isSelected())
            {
                accT = "Cuurent Account";
            }
            else if(r2.isSelected())
            {
                accT = "Fixed Deposite Account";
            }
            else if(r4.isSelected())
            {
                accT = "Reccuring Deposite Account";
  
            }
            Random ran = new Random();
            String cardNo= ""+Math.abs((ran.nextLong() % 90000000L)+50409360000000L);
            String pinNO = ""+Math.abs((ran.nextLong()%9000L)+1000L);

            String facility = "";
            if(c1.isSelected())
            {
                facility = facility + "ATM card";
            }
            else if(c2.isSelected())
            {
                facility = facility +"Internet banking";
            }
            else if(c3.isSelected())
            {
                facility = facility  + "Mobile Banking";
            } else if (c4.isSelected()) {
                facility = facility + "Email & SMS Alert";
            }

             else if(c5.isSelected())
            {
                facility = facility + "Cheque Book";

            }
             else if(c6.isSelected())
            {
                facility = facility + "E-Statement";
            }
             try
             {
                 if(accT.equals(""))
                 {
                     JOptionPane.showMessageDialog(null,"Empty");
                 }
                 else  {
                 conn c = new conn();
                 String query = "insert into signupThree values('" + accT + "','" + cardNo + "','" + pinNO + "','" + facility + "')";
                 String query2 = "insert into log values('"+cardNo+"','"+pinNO+"')";
                 c.s.executeUpdate(query);
                 c.s.executeUpdate(query2);

                JOptionPane.showMessageDialog(null,"Card NUmber "+cardNo+"\n Pin "+pinNO);
             }
                                }
             catch(Exception e)
             {
                 System.out.println(e);
             }
        }
        else if(aa.getSource()==cancel)
        {

        }
    }
    public static void main(String[] args)


    {
        new signupThree();
    }
}
