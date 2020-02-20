/*Ackermann.java
Berechnet die Ackermann-Funktion die wie folget definiert ist
Die Ackermann-Funktion ist eine Abbildung von zwei ganzen Zahlen n und m auf eine ganze
Zahl a(n,m):
a(0,m) = m + 1
a(n,0) = a(n - 1, 1)
a(n,m) = an - 1, a(n, m - 1))
Marc Cremer 2020
*/

import java.util.Scanner;

public class Ackermann{
	public static Scanner input; //scanner in die Klasse damit er verfügbar ist
	public static double counter = 0;
	private static void println(Object line) {
		//shortcut damit ich nicht immer System.out schreiben muss
    	System.out.println(line);
	}
	private static void print(Object line) {
		//shortcut damit ich nicht immer System.out schreiben muss
    	System.out.print(line);
	}


	public static void main(String[] args) {
		double n;
		double m;
		input = new Scanner(System.in);

		print("Zahl 1 bitte:");
		n = input.nextInt();
		print("Zahl 2 bitte:");
		m = input.nextInt();
		println("Zahl 1: " + n +" Zahl 2: " + m);
		println("ack: " +Ackermann.ack(n,m));


	}

	public static double ack(double n, double m){
		if (n == 0) {
			return m+1;
		}
		if (m == 0) {
			return ack(n-1,1);
		}
		return ack(n-1,ack(n,m-1));
		/*nach 46403110 mal ack(n,m) gibts einem stack overflow error */
	}
}
