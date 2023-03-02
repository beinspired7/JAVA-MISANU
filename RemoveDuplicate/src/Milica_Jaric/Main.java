package Milica_Jaric;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Napisati program koji iz zadatog niza briše duplikate. 1232145657 -> 1234567
 * 
 * @author Milica Jaric
 *
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<Integer> Duplikati = new ArrayList<Integer>();
		System.out.println("Uneti broj: ");
		int n = scan.nextInt();
		int m = scan.nextInt();

		Duplikati.add(n);
		Duplikati.add(m);

		 System.out.println("ArrayList with duplicates : "
                 + Duplikati);
		 List<Integer> newList = Duplikati.stream()
                 .distinct()
                 .collect(Collectors.toList());
	
//		    LinkedHashSet<String> newList = new LinkedHashSet<>(Arrays.asList(n));

		 System.out.println("ArrayList with duplicates removed: "
                 + newList);
	}


}
