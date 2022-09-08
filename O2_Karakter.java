/* Les inn poengsum (heiltal) som student har fått på ein prøve. 
 * Berekn poengsummen til bokstavkarakter.
 * Skriv ut bokstavkarakter.
 * Feilmelding ved ugyldig poengsum (negativ, eller over 100)
 * Les inn poengsum 10 stud. og skriv ut karakter eller feilmelding etter kvar innlesing (for-løkke)
 * Kontroll på innlesinga i pkt b sånn at ugydlige poengsummar (neg. eller >100 må lesast inn på nytt)
 */

//sjå meir på "legg inn kontroll slik at ugyldige poengsummar må lesast inn på nytt,
//og framles ta imot 10 avlesingar

package no.hvl.dat100;

import javax.swing.JOptionPane;

public class O2_Karakter {

	public static void main(String[] args) {
		
		//få inn noko som angir at det må vere 10 GYLDIGE avlesingar
		for (int i= 0; i< 10; i++) {
		
		//dialogboks bruker skrive inn sin poengsum
		String svar;
		svar = JOptionPane.showInputDialog("Oppgi din poengsum (0-100): ");
		int poengsum = Integer.parseInt(svar);
		
		
			
		//karakterskala
		if (poengsum <=39 && poengsum >0) {
			System.out.println("Din karakter er F");
		} else if (poengsum <=49 && poengsum >=40) {
			System.out.println("Din karakter er E");
		} else if (poengsum <=59 && poengsum >=50) { 
			System.out.println("Din karakter er D");
		} else if (poengsum <=79 && poengsum >=60) {
			System.out.println("Din karakter er C");
		} else if (poengsum <=89 && poengsum >=80) {
			System.out.println("Din karakter er B");
		} else if (poengsum <=100 && poengsum >=90){
			System.out.println("Din karakter er A");
		} else
			System.out.println("Ugyldig poengsum");
	}}}
			
	