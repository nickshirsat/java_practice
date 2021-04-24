package awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LoginAnonymousEvent {
	void generateFrame() {
		TextField tName, tPassword, tDisplay;
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
		
		//On Login Button click
		btnLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String name = tName.getText();
				String password = tPassword.getText();
				if(name.equals("Nikhil") && password.equals("12345%")) {
					System.out.println("Logged in");
				}
				tDisplay.setText(tName.getText());
			}
		});
		//On click - Reset
		btnReset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("reset");
				tDisplay.setText("");
				tName.setText("");
				tPassword.setText("");
			}
		});
		
		f.add(Name);
		f.add(tName);
		f.add(Password);
		f.add(tPassword);
		f.add(btnLogin);
		f.add(btnReset);
		f.add(Display);
		f.add(tDisplay);
		
		//For Closing the window
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		f.setLayout(null);
		f.setTitle("My Login");
		f.setSize(500,600);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginAnonymousEvent l = new LoginAnonymousEvent();
		l.generateFrame();
	}

}
