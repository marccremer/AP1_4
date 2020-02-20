/** @author Marc Cremer **/


package taxistand;


public class Schlange {
	/** doofe variable **/
	private int 	nextfree;
	private Taxi[] 	arr;
	private int 	size;


/** Erstellt ein Object Schlange mit der Größe size
	@param size die Größe der Schlange
	 **/
	public Schlange(int size){
/*	Im Script hat der Konstruktor den parameter nextfree
	Dies macht aber keinen Sinn,da eine neue Schlanger immer leer ist und
	der nextfree wert daher nur von der schlangengroesse abhängt*/
		this.arr = new Taxi[size];
		this.size = size;
		this.nextfree = size-1;
	}

/** Setzt die Schlange auf NULL
**/
	public void clear(){
		for (int i = 0;i < size ;i++ ) {
			arr[i] = null;
		}
		nextfree = size-1;
	}

/** Entfernt das vordeste Taxi object
	Gibt einen Fehler aus wenn die Schlange leer ist.
	@return Taxi object
**/
	public Taxi dequeue(){
		if (nextfree == 0) {
			System.out.println("ERR!:Kein Taxi in der Schlange");
			return new Taxi("err","ERR",-1);
		}
		Taxi leaving;
		leaving = arr[size-1];
		weiterfahren();
		return leaving;
	}

/** Schiebt die Taxi objecte in der Schlange einen Platz weiter
	und gibt den hintersten Platz frei
*/
	private void weiterfahren(){
		for (int i = size-1;i > 0 ;i-- ) {
			arr[i] = arr[i-1];
		}
		nextfree++;
		arr[nextfree] = null;
	}

/**Schiebt ein Taxi von hinten in die Schlange
	Gibt einen fehler aus wenn die Schlange voll ist
	@param entering Das Taxi das in die Schlange geht
**/
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
			//wir belegen einen PLatz und markieren 
			arr[nextfree] = entering;
			nextfree--;
		}
	}

/** Gibt den Inhalt der Schlange aus
**/
	public void ausgeben(){
		//gibt alle eigenschaften der taxi objecte in der Schlange aus
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
					+ (size-i);
				System.out.println(current);
			}
		}
		if (taxicounter == 0) {
			System.out.println("Kein Taxi im Stand.\n Alle " + size + " Plätze frei.");
		}
	}
}