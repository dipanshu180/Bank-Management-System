import javax.swing.*;
import java.awt.*;

import java.awt.event.*;

public class signup2  extends JFrame implements ActionListener {

    JTextField Tincome, TEA, TSc, Tad, Tpan, Tqul;
    JComboBox Trel, Tocc, Tcat;
    JButton next;

    signup2() {
        setLayout(null);
        setSize(800, 800);

        setLocation(330, 40);
        setVisible(true);
        setTitle("Addition Details");

        JLabel form = new JLabel("Additional Details: ");
        form.setBounds(200, 40, 400, 40);
        form.setFont(new Font("Raleway", Font.BOLD, 35));
        add(form);

        JLabel religion = new JLabel("Religion: ");
        religion.setBounds(100, 120, 100, 30);
        religion.setFont(new Font("Raleway", Font.BOLD, 20));
        add(religion);


        JLabel Category = new JLabel("Category: ");
        Category.setBounds(100, 170, 100, 30);
        Category.setFont(new Font("Raleway", Font.BOLD, 20));
        add(Category);

        JLabel income = new JLabel("Income: ");
        income.setBounds(100, 220, 100, 30);
        income.setFont(new Font("Raleway", Font.BOLD, 20));
        add(income);

        JLabel edu = new JLabel("Qualification: ");
        edu.setBounds(100, 270, 200, 30);
        edu.setFont(new Font("Raleway", Font.BOLD, 20));
        add(edu);

        JLabel occ = new JLabel("Occupation: ");
        occ.setBounds(100, 320, 200, 30);
        occ.setFont(new Font("Raleway", Font.BOLD, 20));
        add(occ);

        JLabel pan = new JLabel("Pan Number: ");
        pan.setBounds(100, 370, 200, 30);
        pan.setFont(new Font("Raleway", Font.BOLD, 20));
        add(pan);

        JLabel adh = new JLabel("Aadhar Number: ");
        adh.setBounds(100, 420, 200, 30);
        adh.setFont(new Font("Raleway", Font.BOLD, 20));
        add(adh);

        JLabel senCity = new JLabel("Senior Citizen: ");
        senCity.setBounds(100, 470, 200, 30);
        senCity.setFont(new Font("Raleway", Font.BOLD, 20));
        add(senCity);

        JLabel exitsA = new JLabel("Existing Account: ");
        exitsA.setBounds(100, 520, 200, 30);
        exitsA.setFont(new Font("Raleway", Font.BOLD, 20));
        add(exitsA);

        String rel[] = {"Hindu", "Musliim", "Sikh", "Christan", "Othre"};
        Trel = new JComboBox(rel);
        Trel.setBounds(300, 120, 400, 30);
        Trel.setBackground(Color.white);
        add(Trel);

        String cat[] = {"General", "OBC", "SC", "ST", "Other"};
        Tcat = new JComboBox(cat);
        Tcat.setBounds(300, 170, 400, 30);
        Tcat.setBackground(Color.white);
        add(Tcat);


        Tincome = new JTextField();
        Tincome.setBounds(300, 220, 400, 30);
        Tincome.setFont(new Font("Raleway", Font.BOLD, 18));
        add(Tincome);

        Tqul = new JTextField("INCOME");
        Tqul = new JTextField();
        Tqul.setBounds(300, 270, 400, 30);
        Tqul.setFont(new Font("Raleway", Font.BOLD, 18));
        add(Tqul);

        String oc[] = {"Student", "Self-Emplyoed", "Bussiness ", " Salaried"};
        Tocc = new JComboBox(oc);
        Tocc.setBounds(300, 320, 400, 30);
        Tocc.setBackground(Color.white);
        add(Tocc);

        Tpan = new JTextField();

        Tpan.setBounds(300, 370, 400, 30);
        Tpan.setFont(new Font("Raleway", Font.BOLD, 18));
        add(Tpan);

        Tad = new JTextField("INCOME");
        Tad = new JTextField();
        Tad.setBounds(300, 420, 400, 30);
        Tad.setFont(new Font("Raleway", Font.BOLD, 18));
        add(Tad);

        TSc = new JTextField("INCOME");
        TSc = new JTextField();
        TSc.setBounds(300, 470, 400, 30);
        TSc.setFont(new Font("Raleway", Font.BOLD, 18));
        add(TSc);

        TEA = new JTextField("INCOME");
        TEA = new JTextField();
        TEA.setBounds(300, 520, 400, 30);
        TEA.setFont(new Font("Raleway", Font.BOLD, 18));
        add(TEA);

        next = new JButton("Next");
        next.setBounds(600,600,100,30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(Color.white);
    }

    public void actionPerformed (ActionEvent e )
    {
        String sreligion = (String) Trel.getSelectedItem();
        String scat = (String ) Tcat.getSelectedItem();
        String socc = (String) Tocc.getSelectedItem();
        String sincome = Tincome.getText();
        String  stea = TEA.getText();
        String ssc = TSc.getText();
        String sad = Tad.getText();
        String span = Tpan.getText();
        String squl = Tqul.getText();

        try
        {

                conn c = new conn();
                    String query = "insert into signuptwo values ('"+sreligion+"', '"+scat+"' , '"+socc+"','"+stea+"','"+sincome+"', '"+sad+"','"+ssc+"','"+span+"','"+squl+"')";
                c.s.executeUpdate(query);
                setVisible(false);
                new signupThree().setVisible(true);
            }

        catch(Exception ex)
{
            System.out.println(ex);
        }



    }







    public static void main(String[] args)
    {
        new signup2();
    }

}
