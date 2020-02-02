package main;

//Tema 4: Suma este egala cu 1013.


public class Tema4 {

 	public static void main(String[] args) {
 		int suma = 0;
 		for(int i = 1; i < 10; i++ ) {
 			suma += suma + i;
 		
 		}
 		System.out.println("Suma este:" + suma);
 	}

 }