package Milica_Jaric;

import java.util.ArrayList;
import java.util.Scanner;

/**		BINARNI I DECIMALNI BROJEVI (JAVA PROGRAMIRANJE)
		Konverzija iz dekadnog (decimalnog) u binarni zasniva se na dijeljenju. Logično je da se suprotna transformacija, binarnog u dekadni, zasniva na množenju (binarna cifra se množi stepenom  baze, i onda dodaje na sumu).

		Primjer konverzije
		Broj 68 iz dekadnog u binarni :
		68:2=34 ostatak: 0
		34:2=17 ostatak: 0
		17:2=8 ostatak: 1
		8:2=4 ostatak: 0
		4:2=2 ostatak: 0
		2:2=1 ostatak: 0
		1:2=0 ostatak: 1

		Postupak se završava kada se u dijeljenju dođe do nule (1:2=0, ostatak 1). Rezultat se čita u obrnutom redoslijedu od dobijenog.Dobijeni binarni broj je: 1000100
		(68)10 = (1000100)2
 */
public class Main {

	public static void main(String[] args) {

		  Scanner scan = new Scanner(System.in);
		  ArrayList<Integer>  brojBinarni = new ArrayList<Integer>();
		  brojBinarni.add(0);
		  brojBinarni.add(1);
		  System.out.println("Unesite binarni broj: ");
		  int broj = scan.nextInt();
		  int n = 0;
		  int i = 0;
		  while ( broj > 0) {
			  n +=  (int) (broj % 10 * Math.pow(2, i));
			  broj = broj / 10;
			  i++;
			    
		  }
		  System.out.println("Dekadni broj za uneseni binarni broj je: " + n );

		 }
		
	}


