/*Integerschlange.java
Marc Cremer 2020 */
package schlange;


public class Integerschlange{

	private static void println(Object line) {
		//shortcut damit ich nicht immer System.out schreiben muss
		System.out.println(line);
	}

	public static void main(String[] args) {
		Queue ss = new Queue(10);
		println("We create a Queue of size 10:");
		ss.printarray();
		int tmp;
		println("overfilling:\n");
		//over fill array
		for (int i = 0; i<13  ; i++) {
			tmp = (i+1)*2;
			if (ss.enqueue(tmp)) {
				println(tmp+" wurde in die Schlange geschoben.Wir haben elemente: "+ss.n_elements);
				ss.printarray();
			}else{
				ss.printarray();
				println("");
			}
		}
		println("\novertaking:");
		//take more than is in the array
		for (int i = 0; i<13  ; i++) {
			ss.printarray();
			tmp = ss.dequeue();
			if (tmp != -1) {
				println(tmp+" verlässt die Schlange");
			}else{
				println("Da ist nichts zu holen.");
			}
		}
	}
}
	
