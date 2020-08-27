package com.prasanth.basicProgs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PassProtect {

	public User[] getUsers() {
		User[] users = new User[5];

		users[0] = new User(1, "Louis", "rxfsuzA2345");
		users[1] = new User();
		users[2] = new User();
		users[3] = new User();
		users[4] = new User();
		return users;

	}

	private String encriptPassword(String value) {
		char[] pass = new char[value.length()];
		if (value == null || value.length() == 1) {
			return null;
		} else {
			for (int i = 0; i < value.length(); i++) {
				Character ch = (char) (value.charAt(i) + 1);
				pass[i] = ch;
			}
		}
		return new String(pass);

	}

	private boolean vaidate(String username, String password) {

		if ((username == null || username.equals("")) && (password == null || password.length() == 0)) {
			return false;
		}
		User[] users = getUsers();
		for (int i = 0; i < users.length; i++) {
			User localUser = users[i];
			if (localUser.getUsername().equalsIgnoreCase(username)) {
				if (encriptPassword(password).equals(localUser.getPassword())) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		PassProtect p = new PassProtect();
		String name = null;
		String pass = null;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter Name");
			name = in.readLine();
			System.out.println("Pass");
			pass=in.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(p.encriptPassword("abc"));
//		System.out.println("" + p.vaidate("louis", "qwerty@1234"));
		System.out.println("" + p.vaidate(name, pass));
	}

}
