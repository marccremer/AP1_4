/*Queue.java
Marc Cremer 2020 */
package schlange;

public class Queue{

	private int 	nextFree;
	private int[]	arr;
	private int 	emptyslots;
	private int 	n_elements;

	public static void main(String[] args) {
		
	}

	public boolean is_empty(){
		if (emptyslots == arr.length) {
			return true;
		}
		return false;
	}

	public boolean is_full(){
		if (emptyslots == 0) {
			return true;
		}
		return false;
	}

	public void printarray(){
		System.out.print("The array:");
		for (int elment :arr ) {
			System.out.print(elment+ " ");
		}
	}

	public int dequeue(){
		//System.out.println("emp:"+emptyslots);
		if (is_empty()) {
			System.out.println("Empty Queue");
			return -1;
		}
		int val = arr[0];
		for (int i = 1 ;i <= n_elements-1;i++ ) {
			arr[i-1] = arr[i];
		}
		arr[n_elements-1] = 0;
		emptyslots++;
		n_elements--;
		return val;

	}

	public boolean enqueue(int n){
		//check if we got space
		if (is_full()) {
			return false;
		}else if (is_empty()) {
		emptyslots--;
		nextFree++;
		n_elements++;
		arr[0] = n;
		}else {
			for (int i = (n_elements);i > 0 ;i-- ) {
				arr[n_elements] = arr[n_elements-1];
			}
		n_elements++;
		emptyslots--;
		arr[0] = n;
		}



		return true;
	}

	public Queue(int size){
		this.arr = new int[size];
		this.nextFree = 0;
		this.emptyslots = size;
		this.n_elements = 0;
	}

	public void testing(){
		System.out.println("test from Queue");
	}
}

