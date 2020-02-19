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
		arr[nextfree] = entering;
	}
	public void ausgeben(){
		int index = 0;
		String current;
		for (int i = 0;i < arr.length; i++) {
			if (arr[i] != null) {
				current = "Das Taxi "
					+ arr[i].nummer()
					+", "
					+arr[i].fahrer()
					+", "
					+arr[i].kennzeichen()
					+" fährt auf Platz "
					+ i;
				System.out.println(current);
			}
		}
	}
}