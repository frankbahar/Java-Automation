package com.class29;

public class RegistrationClass {
	private String email, userName, password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email.contains("gmail")) {
			if (email.contains("@")) {
				this.email = email;
			} else {
				System.out.println("email should contain @");
			}
		} else {
			System.out.println("email should be gmail");
		}
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		if (!userName.isEmpty()) {
			if (userName.length() > 6) {
				this.userName = userName;
			} else {
				System.out.println("username length must be larger than 6");
			}
		} else {
			System.out.println("Username cannot be empty");
		}
	}

	public String getPassword() {

		return password;

	}

	public void setPassword(String password) {
		if (!password.isEmpty()) {
			if (password.length() > 6) {
				if (!password.contains(userName)) {
					this.password = password;
				} else {
					System.out.println("password cannot contain username");
				}
			} else {
				System.out.println("password length must be larger than 6");
			}
		} else {
			System.out.println("Password cannot be empty");
		}
	}

	public static void main(String[] args) {
		RegistrationClass obj = new RegistrationClass();
		obj.setEmail("frank@gml.com");
		obj.setUserName("acar591");
		obj.setPassword("acar591");
		System.out.println(
				"User name " + obj.getUserName() + " Password " + obj.getPassword( ) + " Email " + obj.getEmail());

	}
}
