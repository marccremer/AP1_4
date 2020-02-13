/* Binarysearch.java
Marc Cremer 2020 */
import java.util.Random;

public class Binarysearch{
		private static void println(Object line) {
			//shortcut damit ich nicht immer System.out schreiben muss
			System.out.println(line);
		}
	public static void main(String[] args) {
	 	final int arrlen = 100;
		int[] testarray = new int[arrlen];//the array to be searched
		Random rr = new Random();
		int a = rr.nextInt(10); //our value that we search

		randomizearray(testarray);

		for (int i = 0; i < testarray.length ;i++ ) {
			System.out.println(testarray[i] + " positions: " +i);
		}

		println("Is "+a+" in the array?");
		println("--------");
		int result = binsearch(testarray,a);
		if (result == -1 ) {
			println("No,"+a+" is not in the array.");
		}else{
			println("Yes,"+a+" is in the array at position: "+result);
		}
	}

	private static int[] randomizearray(int[] arr){
		//fills the array with sorted numbers times a random number
		Random r = new Random() ;
		int start = r.nextInt(6)+1;
		for(int i = 0; i< arr.length; i++){
			arr[i] = (i+1) * start;
		}
		return arr;
	}

	private static int binsearch(int[] arr,int x){
		int upperlimit = arr.length-1;
		int lowerlimit = 0;
		boolean notfinished = true;
		while(notfinished && (upperlimit > lowerlimit) ){
			int mid = lowerlimit + (upperlimit - lowerlimit)/2; //this works as it disregards the remainder ie 1/2 = 0
			if ( x == arr[mid])  {
			//We found the number return the index
				notfinished = false;
				return mid;
			}else if (x > arr[mid] ){
			//our number is bigger discard all smaller
				lowerlimit = mid+1;
			}else if (x < arr[mid] ) {
			//our number is smaller discard all bigger
				upperlimit = mid-1;
			}
		}
		return -1;
	}
}