import javax.swing.JFrame;
import javax.swing.JLabel;
public class Login extends JFrame implements ActionListener{
    JLabel l1,l2;
    JTextField f1,f2;
    JButton b1;
    Login()
    {
        l1= new JLabel("username");
        l1.SetBounds(100,100,150,30);
        l2= new JLabel("password");
        l2.SetBounds(100,150,150,30);
        t1=new JTextField();
        t1.SetBounds(200,100,150,30);
        t2=new JTextField();
        t2.SetBounds(200,150,150,30);
        b1=new JButton("submit");
        b1.SetBounds(180,200,150,30);
        add(l1);
        add(l2);
        add(t1);
        add(t2);
        add(b1);
        b1.addActionListener(this);
        SetSize(600,400);
        SetLayout(null);
        SetVisible(true);
        SetDefaultCloseOperation(Jframe.EXIT_ON_CLOSE);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(t1.getText().equals("mno")&&t2.getText().equals("123"))
        {
            JOptionPane.ShowMessageDialog(null,"welcome"&t1.getText()+"!!!");
        }
        else
        {
            JOptionPane.ShowMessageDialog(null,"Invalid username or password");
        }
    }
    public Static void main(String[]args)
    {
        new Login();
    }    
}
