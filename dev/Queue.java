/*Queue.java
Marc Cremer 2020 */
package schlange;

public class Queue{

	private int 	nextFree;
	private int[]	arr;
	private int 	emptyslots;

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
		System.out.println("emp:"+emptyslots);
		if (is_empty()) {
			System.out.println("Empty Queue");
			return -1;
		}
		int val = arr[0];
		for (int i = 1; i < nextFree; i++) {
			arr[i-1] = arr[i];
		}
		emptyslots++;
		nextFree--;
		return val;
	}

	public boolean enqueue(int n){
		//check if we got space
		if (is_full()) {
			return false;
		}
		//no shifting necesary if we only got 1 spot left
		if (emptyslots == 1) {
			emptyslots--;
			nextFree++;
			arr[0] = n;
			return true;
		}
		//shift all the other items then enter the new one 
		for (int i = nextFree ;i >= 0; i--) {
			arr[i+1] = arr[i];
		}
		emptyslots--;
		nextFree++;
		arr[0] = n;
		return true;
	}

	public Queue(int size){
		this.arr = new int[size];
		this.nextFree = 0;
		this.emptyslots = size;
	}

	public void testing(){
		System.out.println("test from Queue");
	}
}

