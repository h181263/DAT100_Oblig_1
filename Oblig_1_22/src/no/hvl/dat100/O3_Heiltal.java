package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O3_Heiltal {
	public static void main(String[] args) {
		
		//eks 5!=5*4*3*2*1 = 120
	
		int fakultet = parseInt(showInputDialog ("Skriv inn eit tal: "));
		int sum = fakultet*(fakultet-1); // (n-1)*n, dette vart ikkje heilt rett, fikk ikkje inn factorial metode
		System.out.println ("Verdien til " + fakultet + "! er: ");
		
	
		for (int i = fakultet; i > 0; i--) {
		
			
			if (i > 1) {
				System.out.print(i + " * ");
			}else {
				System.out.print(i);
			}
		}
		System.out.println ("=" + sum);
		
		
	}
}

