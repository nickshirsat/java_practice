package awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Frame using Composition i.e not extending Frame class

public class LoginFormComposition implements ActionListener{
	TextField tName, tPassword, tDisplay;
	void generateFrame() {
		Frame f = new Frame();
		Label Name, Password, Display;
		Button btnLogin, btnReset ;
		
		Name = new Label("Name : ");
		Name.setBounds(30,50,60,30);
		Password = new Label("Password : ");
		Password.setBounds(30,100,60,30);
	
		tName = new TextField();
		tName.setBounds(120,50,60,30);
		tPassword = new TextField();
		tPassword.setBounds(120,100,60,30);
	
		btnLogin = new Button("Login");
		btnLogin.setBounds(30,150,40,30);
	
		btnReset = new Button("Reset");
		btnReset.setBounds(110,150,40,30);
		
		Display = new Label("Display : ");
		Display.setBounds(30,200, 60,30);
		
		tDisplay = new TextField();
		tDisplay.setBounds(120, 200, 60, 30);
		btnLogin.addActionListener(this);
		btnReset.addActionListener(this);
		f.add(Name);
		f.add(tName);
		f.add(Password);
		f.add(tPassword);
		f.add(btnLogin);
		f.add(btnReset);
		f.add(Display);
		f.add(tDisplay);
		
		f.setLayout(null);
		f.setTitle("My Login");
		f.setSize(500,600);
		f.setVisible(true);
	}
	public static void main(String args[]) {
		LoginFormComposition lc = new LoginFormComposition();
		lc.generateFrame();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Login")) {	
			String name = tName.getText();
			String password = tPassword.getText();
			if(name.equals("Nikhil") && password.equals("12345%")) {
				System.out.println("Logged in");
			}
			tDisplay.setText(tName.getText());
		}
		if(e.getActionCommand().equals("Reset")) {
			System.out.println("reset");
			tDisplay.setText("");
			tName.setText("");
			tPassword.setText("");
		}
	}
}
