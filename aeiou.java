package javaproject;

import java.security.PublicKey;

public class aeiou {

	public static void main(String[] args) {
		aeiou obj = new aeiou();
		System.out.println(obj.isvowel('a'));
	}
		public boolean isvowel(char ch) {
			switch (ch) {
			case 'A','E','I','O','U':
			case 'a','e','i','o','u': 
				return true;
				default: 
					return false;
			}


	}

}
