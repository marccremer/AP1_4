/*App.java
Marc Cremer */
package taxistand;

public class App {
	public static void main(String[] args) {
	Taxi a = new Taxi("Christoph","GM",1);
	Taxi b = new Taxi("Sarah","SU",2);
	Taxi c = new Taxi("Angela","K",3);
	Taxi d = new Taxi("Marc","EU",4);
	int tstandgrosse = 3;
	Schlange taxistand1 = new Schlange(tstandgrosse);
	println("Ausgangsituation:\n Der Stand hat " +tstandgrosse+" PLätze");
	taxistand1.clear();
	taxistand1.ausgeben();
	println("");
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