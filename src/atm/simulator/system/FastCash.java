
package atm.simulator.system;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener{
      
    JButton hundred, fiveHundred, oneThousand, twoThousand, fiveThousand, tenThousand, back;
    String pinnumber;
    FastCash(String pinnumber){
        this.pinnumber = pinnumber;
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text = new JLabel("SELECT WITHDRAWL AMOUNT ");
        text.setBounds(220,300,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        image.add(text);
        
        hundred = new JButton("Rs 100");
        hundred.setBounds(170,415,150,30);
        hundred.addActionListener(this);
        image.add(hundred);
        
        fiveHundred = new JButton("Rs 500");
        fiveHundred.setBounds(335,415,150,30);
        fiveHundred.addActionListener(this);
        image.add(fiveHundred);
        
        oneThousand = new JButton("Rs 1000");
        oneThousand.setBounds(170,450,150,30);
        oneThousand.addActionListener(this);
        image.add(oneThousand);
        
        twoThousand = new JButton("Rs 2000");
        twoThousand.setBounds(335,450,150,30);
        twoThousand.addActionListener(this);
        image.add(twoThousand);
        
        fiveThousand = new JButton("Rs 5000");
        fiveThousand.setBounds(170,485,150,30);
        fiveThousand.addActionListener(this);
        image.add(fiveThousand);
        
        tenThousand = new JButton("Rs 10000");
        tenThousand.setBounds(335,485,150,30);
        tenThousand.addActionListener(this);
        image.add(tenThousand);
        
        back= new JButton("BACK");
        back.setBounds(335,520,150,30);
        back.addActionListener(this);
        image.add(back);
     
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == back){
           setVisible(false);
           new Transactions(pinnumber).setVisible(true);
        } else {
            String amount = ((JButton)ae.getSource()).getText().substring(3);
            Conn c = new Conn();
            try{
                ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"' ");
                int balance = 0;
                while(rs.next()){
                    if(rs.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(rs.getString("amount"));
                    }else{
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }
                
                if(ae.getSource() != back && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                }
                Date date = new Date();
                String query = "insert into bank values('"+pinnumber+"', '"+date+"', 'Withdrawl', '"+amount+"' )";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs "+amount+ " Debited Sucessfylly" );
                
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
            }catch(Exception e){
                System.out.println(e);
            }
            
        }
        
    }
    
    public static void main(String[] args) {
        
        new FastCash("");
    }
    
}
