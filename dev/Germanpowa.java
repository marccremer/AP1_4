/* Germanpowa.java
Marc Cremer 2020 */

import java.util.Scanner;	//Scanner
import java.util.Locale;


public class Germanpowa  {

	public static Scanner input; //scanner in die Klasse damit er verfügbar ist	
	private static void println(Object line) {
		//shortcut damit ich nicht immer System.out schreiben muss
		System.out.println(line);
	}

	private static void print(Object line) {
		//shortcut damit ich nicht immer System.out schreiben muss
		System.out.print(line);
	}	

	public static void main(String[] args) {
		double basis;
		double exp;
		input = new Scanner(System.in);

		Locale.setDefault(Locale.GERMANY);

		println("Expontential Rechner");
		print("Basis bitte:");
		basis = input.nextDouble();
		print("Eponent bitte:");
		exp = input.nextDouble();		
		println("Die Potenz von "+basis+" hoch "+exp+" ist "+Math.pow(basis,exp));

	}
}