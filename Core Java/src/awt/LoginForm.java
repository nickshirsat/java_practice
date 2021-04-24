package awt;

//Extends Frame Class

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class LoginForm extends Frame{
	LoginForm() {
		Label Name, Password;
		TextField tName, tPassword;
		Button btnLogin, btnBackToHome ;
		
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
	
		btnBackToHome = new Button("Home");
		btnBackToHome.setBounds(110,150,40,30);
		
		add(Name);
		add(tName);
		add(Password);
		add(tPassword);
		add(btnLogin);
		add(btnBackToHome);
		
		setLayout(null);
		setTitle("My Login");
		setSize(500,600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginForm l = new LoginForm();
	}

}
