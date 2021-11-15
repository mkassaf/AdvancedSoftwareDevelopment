package edu.najah.cap;

import java.util.Iterator;

public class Email {
	
	//Email string
	public String str;
	
	public Email(String string){
		this.str = string;
	}
	
	public boolean EmailCheck() {
		if(this.str != null || this.str != "") {
			//The email should contain at least 4 chars which are username, @, domain, dot and email prefex like com 
			if(this.str.length() < 5) {
				return false;
			}
			if(this.str.indexOf("@") == -1) {
				return false;
			}
			String[] array = str.split("@");//test@
			String string1 = array[0];// is test which is the username
			String string2 = array[1];// najah.edu which is the domain
			
			//First char of username should be  letter
			if(!(string1.charAt(0) >= 'A' && string1.charAt(0) <= 'Z' ) ||
					!(string1.charAt(0) >= 'a' && string1.charAt(0) <= 'z' )) {
				return false;
			}
			//The username should start with letter and should contain letter, number or _ only.
			for (int i = 1; i < string1.length(); i++) {
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

}
