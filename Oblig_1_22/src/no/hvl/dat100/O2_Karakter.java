package no.hvl.dat100;

import javax.swing.JOptionPane;

public class O2_Karakter {

	public static void main(String[] args) {
		
		final int ANT_STUDENTAR = 10;
		// då blir verdi for <= ANT_STUDENTAR
		

				for (int i= 1; i<= ANT_STUDENTAR; i++) {
				
				//dialogboks bruker skrive inn sin poengsum
				String svar;
				svar = JOptionPane.showInputDialog("Oppgi din poengsum (0-100): ");
				int poengsum = Integer.parseInt(svar);
				
				String karakter = "";
				
					
				//karakterskala
				if (poengsum <=39 && poengsum >0) {
					karakter = "F";
					System.out.println("Din karakter er " + karakter);
				} else if (poengsum <=49 && poengsum >=40) {
					karakter = "E";
					System.out.println("Din karakter er " + karakter);
				} else if (poengsum <=59 && poengsum >=50) { 
					karakter = "D";
					System.out.println("Din karakter er " + karakter);
				} else if (poengsum <=79 && poengsum >=60) {
					karakter = "C";
					System.out.println("Din karakter er " + karakter);
				} else if (poengsum <=89 && poengsum >=80) {
					System.out.println("Din karakter er " + karakter);
					karakter = "B";
				} else if (poengsum <=100 && poengsum >=90){
					System.out.println("Din karakter er " + karakter);
				} else {	
			} JOptionPane.showMessageDialog(null, "Ugyldig poengsum, prøv igjen");
			i--;
				}
	}
	}	



