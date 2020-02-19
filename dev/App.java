/*App.java
Marc Cremer */
package taxistand;

public class App {
	public static void main(String[] args) {
	Taxi a = new Taxi("Christoph","GM",1);
	Taxi b = new Taxi("Sarah","SU",2);
	Taxi c = new Taxi("Angela","K",3);
	Taxi d = new Taxi("Marc","EU",4);
	Schlange taxistand1 = new Schlange(10);
	println("Ausgangsituation");
	taxistand1.clear();
	taxistand1.ausgeben();
	taxistand1.enqueue(a);
	taxistand1.enqueue(b);
	taxistand1.enqueue(c);
	taxistand1.enqueue(d);
	taxistand1.ausgeben();
	
	}

	private static void println(Object line) {
		//shortcut damit ich nicht immer System.out schreiben muss
		System.out.println(line);
	}
}