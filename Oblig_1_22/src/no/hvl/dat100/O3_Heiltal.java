package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O3_Heiltal {
	public static void main(String[] args) {
		
		//eks 5!=5*4*3*2*1 = 120
	//brukarinput, brukar skriv inn tal
		int input = parseInt(showInputDialog ("Skriv inn eit tal: "));
		int sum = 1;
		System.out.print("Verdien til " + input + "! er: ");
		
	
		for (int i = input; i > 0; i--) {
			sum = sum*i; //hurtig ville vore sum*= i
			
			
			if (i > 1) {
				System.out.print(i + " * ");
			}else {
				System.out.print(i);
			}
		}
		System.out.println (" = " + sum); 
		
		
	}
}

