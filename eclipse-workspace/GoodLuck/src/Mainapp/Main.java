package Mainapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException, SQLException, ClassNotFoundException {
		
		System.out.println("Register Here");
		System.out.println("Login Here");
		int x;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		x = Integer.parseInt(br.readLine());
		
		
		RegisterPojo registerpojo = new RegisterPojo();
		RegisterDAO registerdao = new RegisterDAO();
		LoginPojo loginpojo = new LoginPojo();
		LoginDAO logindao = new LoginDAO();
		
		switch(x)
		{
		case 1:
			System.out.println("enter your first name: ");
			String firstname = br.readLine();
			System.out.println("enter your last name: ");
			String lastname = br.readLine();
			System.out.println("enter your user name:");
			String username = br.readLine();
			System.out.println("enter your Email :");
			String email = br.readLine();
			System.out.println("enter your Password:");
			String password = br.readLine();
			
			registerpojo.setFirstname(firstname);
			registerpojo.setLastname(lastname);
			registerpojo.setUsername(username);
			registerpojo.setPassword(password);
			registerpojo.setEmail(email);

			registerdao.addUser(registerpojo);
			
			break;
		case 2:
			
			System.out.println("enter your user name:");
			String name = br.readLine();
			System.out.println("enter your Password:");
			String pass = br.readLine();			
			loginpojo.setUsername(name);
			loginpojo.setPassword(pass);
			if(logindao.validate(loginpojo)==true) {
				Luck luck = new Luck();
				luck.display();
			}
			else
				System.out.println("Incorrect Username/Password");

			break;
		
		}
	}

}
