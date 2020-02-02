package main;

//Tema 5: Afisaza rezultatul n!=479001600


public class Tema5 {

	public static  void main (String [] args) {
		int i = 1;
		int fact = 1;
		int n = 13;
		
	for (i=1; i<n; i++) {
		fact = fact* i;
	}
	
System.out.println("n!=" + fact);
	}
	
}