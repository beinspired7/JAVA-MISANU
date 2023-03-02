package Milica_Jaric1;

import java.util.Arrays;
import java.util.LinkedHashSet;

/**
 * 
 * @author Milica Jaric
 *	
 *Napisati program koji iz zadatog niza briše duplikate. 1232145657 -> 1234567
 */
public class Main {

	public static void main(String[] args) {
		 String[] zadatiNiz = {"1", "2", "3", "2", "1", "4", "5", "6", "5", "7"};

		    LinkedHashSet<String> filtriraniNiz = new LinkedHashSet<>(Arrays.asList(zadatiNiz));

		    System.out.println(filtriraniNiz);
	}

}