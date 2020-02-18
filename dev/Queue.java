/*Queue.java
Marc Cremer 2020 */
package schlange;

public class Queue{

	private int[]	arr;
	private int 	emptyslots;
	public int 	n_elements;

	public static void main(String[] args) {
		
	}

	public boolean is_empty(){
		//check if the Queue is empty
		if (emptyslots == arr.length) {
			return true;
		}
		return false;
	}

	public boolean is_full(){
		//check if the Queue is full
		if (emptyslots == 0) {
			return true;
		}
		return false;
	}

	public void printarray(){
		//print the Queue elements
		System.out.print("The array:");
		for (int elment :arr ) {
			System.out.print(elment+ " ");
		}
		System.out.println("|");
	}

	public int dequeue(){
		//returns the element that last entered the Queue or -1 if the queue is empty
		if (is_empty()) {

			System.out.println("Empty Queue!!");
			return -1;
		}
		int val = arr[n_elements-1];
		arr[n_elements-1] = 0;
		emptyslots++;
		n_elements--;
		return val;

	}

	public boolean enqueue(int n){
		//takes an integer to put in the Queue and returns true if succesfull

		//check if we got space
		if (is_full()) {
			return false;
		}else if (is_empty()) {
		//dont shift if its empty
		emptyslots--;
		n_elements++;
		arr[0] = n;
		}else {
		//shift the other elements to make space at the front
			for (int i = (n_elements);i > 0 ;--i ) {
				arr[i] = arr[i-1];
				printarray();
			}
		n_elements++;
		emptyslots--;
		arr[0] = n;
		}



		return true;
	}

	public Queue(int size){
		//creeate an array of size "size" and set atributes
		this.arr = new int[size];
		this.emptyslots = size;
		this.n_elements = 0;
	}

	public void testing(){
		System.out.println("test from Queue");
	}
}

