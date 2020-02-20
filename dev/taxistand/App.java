/** 
	@author Marc Cremer 
**/

package taxistand;

public class App {
	public static void main(String[] args) {
	Taxi a = new Taxi("Christoph","GM 23",56);
	Taxi b = new Taxi("Sarah","SU 123",22);
	Taxi c = new Taxi("Angela","K 666",112);
	Taxi d = new Taxi("Marc","EU 1337",19);
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
	println(taxistand1.dequeue().fahrer() + " verlässt den taxistand");
	println("neuer stand \n");
	taxistand1.ausgeben();
	taxistand1.dequeue();
	taxistand1.dequeue();
	taxistand1.dequeue();
	taxistand1.dequeue();
	}

	private static void println(Object line) {
		//shortcut damit ich nicht immer System.out schreiben muss
		System.out.println(line);
	}
}