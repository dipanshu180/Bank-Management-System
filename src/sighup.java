import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;

public class sighup extends JFrame implements ActionListener {

  JTextField Tname , Tfname , Temail , Tadd , Tcity , Tstate  , Tpin;
  JButton next;
  JRadioButton male , female , met ,mat ;
  JDateChooser Tdob;
 sighup()
    {
     getContentPane().setBackground(Color.WHITE);
        setTitle("Application Form");


        setSize(850, 800);
        setLocation(350,10);

        setLayout(null);

        // Create a new JLabel with the specified text
        JLabel formno = new JLabel("APPLICATION FORM NUMBER:");

        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
       add(formno);

        JLabel personalDetail = new JLabel("Page 1: Personal Details");
        personalDetail.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDetail.setBounds(290, 80, 400, 40);
        add(personalDetail);

        JLabel name = new JLabel("Name: ");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 400, 30);
        add(name);

        Tname = new JTextField();
        Tname.setBounds(300,140,400,30);
        Tname.setFont(new Font("Raleway",Font.BOLD,18));
        add(Tname);

        JLabel fname = new JLabel("Father's Name: ");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
       fname.setBounds(100, 190, 400, 30);
        add(fname);

        Tfname = new JTextField();
        Tfname.setBounds(300,190,400,30);
        Tfname.setFont(new Font("Raleway",Font.BOLD,18));
        add(Tfname);

        JLabel dob = new JLabel("Date of Birth: ");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 400, 30);
        add(dob);

         Tdob = new JDateChooser();
        Tdob.setBounds(300,240,200,30);
        add(Tdob);



        JLabel gender = new JLabel("Gender: ");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 400, 30);
        add(gender);

         male = new JRadioButton("Male");
        male.setBounds(300,290,100,30);
        add(male);

         female = new JRadioButton("Female");
        female.setBounds(450,290,100,30);
        add(female);

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        JLabel Email = new JLabel("Email Address: ");
        Email.setFont(new Font("Raleway", Font.BOLD, 20));
        Email.setBounds(100, 340, 400, 30);
        add(Email);

        Temail = new JTextField();
        Temail.setBounds(300,340,400,30);
        Temail.setFont(new Font("Raleway",Font.BOLD,18));
        add(Temail);


        JLabel marital = new JLabel("Marital Status: ");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100, 390, 400, 30);
        add(marital);

         mat = new JRadioButton("Single");
        mat.setBounds(300,390,100,30);
        add(mat);

         met = new JRadioButton("Married");
         met.setBounds(450,390,100,30);
         add(met);
         ButtonGroup ba  = new ButtonGroup();
         ba.add(met);
         ba.add(mat);

        JLabel adde = new JLabel("Address: ");
        adde.setFont(new Font("Raleway", Font.BOLD, 20));
        adde.setBounds(100, 440, 400, 30);
        add(adde);

        Tadd = new JTextField();
        Tadd.setBounds(300,440,400,30);
        Tadd.setFont(new Font("Raleway",Font.BOLD,18));
        add(Tadd);

        JLabel city = new JLabel("City: ");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490, 400, 30);
        add(city);

        Tcity = new JTextField();
        Tcity.setBounds(300,490,400,30);
        Tcity.setFont(new Font("Raleway",Font.BOLD,18));
        add(Tcity);

        JLabel state = new JLabel("State: ");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 540, 400, 30);
        add(state);

        Tstate = new JTextField();
        Tstate.setBounds(300,540,400,30);
        Tstate.setFont(new Font("Raleway",Font.BOLD,18));
        add(Tstate);

        JLabel pin = new JLabel("Pin Code");
        pin.setFont(new Font("Raleway", Font.BOLD, 20));
        pin.setBounds(100, 590, 400, 30);
        add(pin);

         Tpin = new JTextField();
        Tpin.setBounds(300,590,400,30);
        Tpin.setFont(new Font("Raleway",Font.BOLD,18));
        add(Tpin);

         next = new JButton("Next");
        next.setBounds(600,640,100,30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);



        setVisible(true);

    }
         public void actionPerformed(ActionEvent ae)
    {
            String name  =  Tname.getText();
            String fname  =  Tfname.getText();
            String dob = ((JTextField)Tdob.getDateEditor().getUiComponent()).getText();
            String gender = null;
            if(male.isSelected())
            {
              gender = "Male";
            }
            if(female.isSelected())
            {
             gender = " Female";
            }
            String  email = Temail.getText();
            String matital = null;
            if(mat.isSelected())
            {
             matital = "Married";
            }
            if(met.isSelected())
            {
             matital  = "Unmarried";
            }

            String adde= Tadd.getText();
            String city = Tcity.getText();
            String state= Tstate.getText();
            String pin = Tpin.getText();

            try
            {
              if(name.equals(""))
              {
                    JOptionPane.showMessageDialog(null,"Name is required");
              }
              else {
                conn c = new conn();
                String query = "insert into signup values ('"+name+"', '"+fname+"' , '"+dob+"','"+gender+"', '"+email+"','"+matital+"','"+adde+"','"+city+"','"+state+"','"+pin+"')";
                c.s.executeUpdate(query);
                setVisible(false);
                new signup2().setVisible(true);
              }
            }
            catch(Exception e)
            {
             System.out.println(e);
            }
      }
    public static void main(String[]args)
    {
        new sighup();
    }
}
