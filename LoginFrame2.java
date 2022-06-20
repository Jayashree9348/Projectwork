package Test.MainJava.com;
import javax.swing.*;
import java.awt.*;  
import java.awt.event.*;  
import java.lang.Exception;  
class CreateLoginForm extends JFrame implements ActionListener  
{  
    JButton b1 ,b2;  
    JPanel newPanel;  
    JLabel userLabel, passLabel ,typeLabel;  
    final JTextField  textField1, textField2;  
    JRadioButton r1 ,r2;
    ButtonGroup u1;
    CreateLoginForm()  
    {       
        userLabel = new JLabel();  
        userLabel.setText("Userid:");     
        textField1 = new JTextField(15);   
        passLabel = new JLabel();  
        passLabel.setText("Password:");      
        textField2 = new JPasswordField(15);  
        typeLabel=new JLabel();
        typeLabel.setText("SelectUsertype:");   
        r1=new JRadioButton("Student");
        r1.setSelected(true);
        r2=new JRadioButton("Faculty");
        r2.setSelected(false);
        u1=new ButtonGroup(); 
        b1 = new JButton("LOGIN");
        b2= new JButton("RESET");   
        newPanel = new JPanel(); 
        newPanel.add(userLabel);      
        newPanel.add(textField1);     
        newPanel.add(passLabel);      
        newPanel.add(textField2);
        newPanel.add(typeLabel);
        newPanel.add(r1); 
        newPanel.add(r2);  
        
        u1.add(r1);
        u1.add(r2);
        
        newPanel.add(b1);   
        newPanel.add(b2);
        add(newPanel, BorderLayout.CENTER);  
          
        //perform action on button click   
        b1.addActionListener(this);       
        setTitle("LOGINFRAME2");         
    }   
    public void actionPerformed(ActionEvent ae)      
    {  
        String userValue = textField1.getText();     
        String passValue = textField2.getText();     
    
        if (userValue.equals("test1@gmail.com") && passValue.equals("test")) {    
            LoginFormDemo page = new LoginFormDemo();  
            page.setVisible(true);                
            JLabel wel_label = new JLabel("Login successfully "+userValue);  
            page.getContentPane().add(wel_label);  
        }  
        else{  
            //show error message  
            System.out.println("Please enter valid username and password");  
        } 
    }  
    
}


public class LoginFormDemo {
	public static void main(String []args)  
    {  
        try  
        {  
            CreateLoginForm form = new CreateLoginForm();  
            form.setSize(270,250);  
            form.setVisible(true);   
        }  
        catch(Exception e)  
        {       
            JOptionPane.showMessageDialog(null, e.getMessage());  
        }  
    }

}
