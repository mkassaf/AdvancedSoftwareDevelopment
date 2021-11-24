package edu.najah.cap;

import java.util.Iterator;

public class Email {
	
	private static final int MIN_LENGHT_OF_EMAIL = 5;
	private static final int STRING_NOT_FOUNT = -1;
	private static final String USERNAME_EMAIL_SEP = "@";
	private static final int INDEX_OF_USERNAME = 0;
	private static final int INDEX_OF_DOMAIN = 1;
	//Email string
	private String email;
	
	public Email(String string){
		this.email = string;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean checkEmail() {
		if(this.email != null || this.email != "") {
			if(this.email.length() < MIN_LENGHT_OF_EMAIL) {
				return false;
			}
			if(this.email.indexOf(USERNAME_EMAIL_SEP) == STRING_NOT_FOUNT) {
				return false;
			}
			String[] emailParts = email.split(USERNAME_EMAIL_SEP);
			String username = emailParts[INDEX_OF_USERNAME];
			String domain = emailParts[INDEX_OF_DOMAIN];
			
			if(!isStartWithLetter(domain) && !isStartWithLetter(username)) {
				return false;
			}
			//The username should start with letter and should contain letter, number or _ only.
			for (int i = 1; i < username.length(); i++) {
				if(!(string1.charAt(i) >= 'A' && string1.charAt(i) <= 'Z' ) ||
						!(string1.charAt(i) >= 'a' && string1.charAt(i) <= 'z' ) ||
						!(string1.charAt(i) >= '0' && string1.charAt(i) <= '9' ) || 
						string1.charAt(i) == '_') {
					return false;
				}
			}
			//First char of domain should be letter
			if(!(string2.charAt(0) >= 'A' && string2.charAt(0) <= 'Z' ) ||
					!(string2.charAt(0) >= 'a' && string2.charAt(0) <= 'z' )) {
				return false;
			}
			if(string2.indexOf(".") == -1) {
				return false;
			}
			String[] array2 = string2.split(".");//naja.com
			string1 = array[0];// domain name which is "najah"

			if(!(string1.charAt(0) >= 'A' && string1.charAt(0) <= 'Z' ) ||
					!(string1.charAt(0) >= 'a' && string1.charAt(0) <= 'z' )) {
				return false;
			}
			//The username should start with letter and should contain letter, number or _ only.
			for (int i = 1; i < string1.length(); i++) {
				if(!(string1.charAt(i) >= 'A' && string1.charAt(i) <= 'Z' ) ||
						!(string1.charAt(i) >= 'a' && string1.charAt(i) <= 'z' ) ||
						!(string1.charAt(i) >= '0' && string1.charAt(i) <= '9' )) {
					return false;
				}
			}
			string2 = array[1];// Top-level domain which is "com"
			if(!(string2.charAt(0) >= 'A' && string2.charAt(0) <= 'Z' ) ||
					!(string2.charAt(0) >= 'a' && string2.charAt(0) <= 'z' )) {
				return false;
			}
			//The username should start with letter and should contain letter, number or _ only.
			for (int i = 1; i < string2.length(); i++) {
				if(!(string2.charAt(i) >= 'A' && string2.charAt(i) <= 'Z' ) ||
						!(string2.charAt(i) >= 'a' && string2.charAt(i) <= 'z' ) ||
						!(string2.charAt(i) >= '0' && string2.charAt(i) <= '9' )) {
					return false;
				}
			}
			
			return true;
		} else {
			return false;
		}
		
	}

	private boolean isStartWithLetter(String username) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean isStartWithletter(String word) {
		if((word.charAt(0) >= 'A' && word.charAt(0) <= 'Z' )) {
			return true;
		}
		return false;
	}

}
