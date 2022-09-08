/* brukte satsane frå skatteetaten sine sider
 * https://www.skatteetaten.no/satser/trinnskatt/?year=2022#rateShowYear
 */

package no.hvl.dat100;
import javax.swing.JOptionPane;

public class O1_trinnskatt {

	public static void main(String[] args) {
		
		
		
		//Overskrifta i dialogboksen, denne blir lagra som tekst
		String brutto;
		brutto = JOptionPane.showInputDialog("Skriv inn di bruttolønn: ");
		
		//vi treng at teksten vi får inn, blir konvertert til tal
		int konverter = Integer.parseInt (brutto);
		
		//sortere denne lønna inn i trinn
		
		if (konverter > 0 && konverter <= 190349) {
			System.out.println("Trinn 0: 0 % trinnskatt");
		} else if (konverter >= 190349 && konverter <= 267899) {
			System.out.println("Trinn 1: 1,7 % trinnskatt");
		} else if (konverter >= 267899 && konverter <= 643799) {
			System.out.println("Trinn 2: 4,0 % trinnskatt");
		} else if (konverter >= 643799 && konverter <= 969199) {
			System.out.println("Trinn 3: 13,4 % trinnskatt");
		} else if (konverter >= 696199 && konverter <= 1999999) {
			System.out.println("Trinn 4: 16,4 % trinnskatt");
		} else if (konverter >= 1999999 && konverter <= 643799) {
			System.out.println("Trinn 5: 17,4 % trinnskatt");

		}
		
	}
}