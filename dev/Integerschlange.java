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
		ss.testing();
		for (int i = 0; i<13  ; i++) {
		if (ss.enqueue(2)) {
			println(2);
		}else{
			ss.printarray();
			println("");
		}
		}
		int tmp;
		for (int i = 0; i<13  ; i++) {
			ss.printarray();
			tmp = ss.dequeue();
			if (tmp != -1) {
				println(tmp);
			}else{
				println("empty");
			}
		}


	}
}
	
