/* Schlange.java
Marc Cremer 2020 */

package taxistand;


public class Schlange {
	private int 	nextfree;
	private Taxi[] 	arr;
	private int 	size;

	public Schlange(int size){
		/*im Script hat der Konstruktor den parameter nextfree
		Dies macht aber keinen Sinn,da eine neue Schlanger immer leer ist und
		der nextfree wert daher nur von der schlangengroesse abhängt*/
		this.arr = new Taxi[size];
		this.size = size;
		this.nextfree = size-1;
	}

	public void clear(){
		for (int i = 0;i < size ;i++ ) {
			arr[i] = null;
		}
	}
	public Taxi dequeue(){
		Taxi leaving;
		leaving = new Taxi("peter","2312",2321);
		return leaving;
	}
	public void enqueue(Taxi entering){
		String output;
		if (nextfree < 0) {
			output = "Das Taxi:"
					+entering.nummer()
					+", "
					+entering.fahrer()
					+", "
					+entering.kennzeichen()
					+" kann nicht einfahren! Der Taxistand ist pick packe voll!";
			System.out.println(output);
		}else{
			arr[nextfree] = entering;
			nextfree--;
		}
	}
	public void ausgeben(){
		int taxicounter = 0;
		String current;


		for (int i = 0;i < arr.length; i++) {
			if (arr[i] != null) {
				taxicounter++;
				current = "Das Taxi "
					+ arr[i].nummer()
					+", "
					+arr[i].fahrer()
					+", "
					+arr[i].kennzeichen()
					+" fährt auf Platz "
					+ (i+1);
				System.out.println(current);
				//System.out.println("line "+i);
			}

		}

		if (taxicounter == 0) {
			System.out.println("Kein Taxi im Stand.\n Alle " + size + " Plätze frei.");

		}
	}
}