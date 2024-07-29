
package atm.simulator.system;
 

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
    
    
    JTextField panTextField, aadharTextField;
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    JComboBox religionBox, categoryBox, incomeBox, educationBox, occupationBox;
    String formno;       
             
    SignupTwo(String fromno){
        this.formno = formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);
        
        JLabel religion = new JLabel("Religion: ");
        religion.setFont(new Font("Raleway", Font.BOLD, 20));
        religion.setBounds(100, 140, 100, 30);
        add(religion);
        
        String valReligion[] = {"Hindu", "Muslim", "Christian", "Others"};
        religionBox = new JComboBox(valReligion);
        religionBox.setBounds(300, 140, 400, 30);
        religionBox.setBackground(Color.WHITE);
        add(religionBox);
        
        JLabel category = new JLabel("Category: ");
        category.setFont(new Font("Raleway", Font.BOLD, 20));
        category.setBounds(100, 190, 150, 30);
        add(category);
        
        String valCategory[] = {"OBC", "General", "SC", "ST", "Others"};
        categoryBox = new JComboBox(valCategory);
        categoryBox.setBounds(300, 190, 400, 30);
        categoryBox.setBackground(Color.WHITE);
        add(categoryBox);  
        
        JLabel income = new JLabel("Income: ");
        income.setFont(new Font("Raleway", Font.BOLD, 20));
        income.setBounds(100, 240, 150, 30);
        add(income);
        
        String valIncome[] = {"NULL", "Less than 1,50,000", "Less than 2,50,000", "Less than 5,00,000", "Upto 10,00,000"};
        incomeBox = new JComboBox(valIncome);
        incomeBox.setBounds(300, 240, 400, 30);
        incomeBox.setBackground(Color.WHITE);
        add(incomeBox);
        
        JLabel educational = new JLabel("Educational ");
        educational.setFont(new Font("Raleway", Font.BOLD, 20));
        educational.setBounds(100, 290, 150, 30);
        add(educational);
        
        JLabel qualification = new JLabel("Qualification: ");
        qualification.setFont(new Font("Raleway", Font.BOLD, 20));
        qualification.setBounds(100, 315, 150, 30);
        add(qualification);
        
        String valEducational[] = {"Non Graduation", "Graduate", "Post Graduation", "Doctrate", "Others"};
        educationBox = new JComboBox(valEducational);
        educationBox.setBounds(300, 290 ,400, 30);
        educationBox.setBackground(Color.WHITE);
        add(educationBox);
        
        JLabel occupation = new JLabel("Occupation: ");
        occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        occupation.setBounds(100, 390, 150, 30);
        add(occupation);
        
        String valOccupation[] = {"Salaried", "Self-Employed", "Student", "Bussiness", "Retired", "Others"};
        occupationBox = new JComboBox(valOccupation);
        occupationBox.setBounds(300, 390 ,400, 30);
        occupationBox.setBackground(Color.WHITE);
        add(occupationBox);
       
        JLabel panNo = new JLabel("PAN Number: ");
        panNo.setFont(new Font("Raleway", Font.BOLD, 20));
        panNo.setBounds(100, 440, 150, 30);
        add(panNo);
        
        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        panTextField.setBounds(300, 440, 400, 30);
        add(panTextField);
        
        JLabel aadharNo = new JLabel("Aadhar Number: ");
        aadharNo.setFont(new Font("Raleway", Font.BOLD, 20));
        aadharNo.setBounds(100, 490, 200, 30);
        add(aadharNo);
        
        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        aadharTextField.setBounds(300, 490, 400, 30);
        add(aadharTextField);
        
        JLabel seniorCitizen = new JLabel("Senior Citizen: ");
        seniorCitizen.setFont(new Font("Raleway", Font.BOLD, 20));
        seniorCitizen.setBounds(100, 540, 150, 30);
        add(seniorCitizen);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup citizenGroup = new ButtonGroup();
        citizenGroup.add(syes);
        citizenGroup.add(sno);
        
        JLabel pincode = new JLabel("Existing Account: ");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup accExistingGroup = new ButtonGroup();
        accExistingGroup.add(syes);
        accExistingGroup.add(sno);
        
        
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        
        
        setSize(850, 800);
        setLocation(350,10);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){

        String religion = (String)religionBox.getSelectedItem();
        String category = (String)categoryBox.getSelectedItem();
        String income = (String)incomeBox.getSelectedItem();
        String education = (String)educationBox.getSelectedItem();
        String occupation = (String)occupationBox.getSelectedItem();
        String seniorCitizen = null;
        if(syes.isSelected()){
            seniorCitizen = "Yes";
        }else if(sno.isSelected()){
          seniorCitizen = "No";
        }
        
        String accExisiting = null;
        if(eyes.isSelected()){
           accExisiting = "Yes";
        }else if(eno.isSelected()){
            accExisiting = "No";
        }
        
        String panNo = panTextField.getText();
        String aadharNo = aadharTextField.getText();      
        
        try{
            Conn c = new Conn();
            String query = "insert into signuptwo values('"+formno+"' , '"+religion+"' , '"+category+"' , '"+income+"' , '"+education+"' , '"+occupation+"' , '"+panNo+"' , '"+aadharNo+"' , '"+seniorCitizen+"' , '"+accExisiting+"' )";
            c.s.executeUpdate(query);   
            
            //signupThree obj
            setVisible(false);
            new SignupThree(formno).setVisible(true);
        }catch (Exception e){
            System.out.println(e);
        }
    }
    
    public static void main(String[] args){
        
        new SignupTwo("");
    }
    
}
