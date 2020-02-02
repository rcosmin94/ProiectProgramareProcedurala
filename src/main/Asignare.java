package main;

// Tema 1 : Va afisa a=2, b=5, c=20. Va calcula a=2 deoarece aceasta este valoare care ii este atribuita.


public class Asignare {
	
	public static void main(String [] args) {
		int a=3;
		int b =(a=2)*a;
		int c=b*(b=5);
		System.out.println("a=" + a+ ",b=" + b + ", c=" +c);
	}
	
	
}