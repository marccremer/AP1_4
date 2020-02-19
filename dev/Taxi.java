/* Taxi.java
Marc Cremer 2020 */
package taxistand;

public class Taxi {
	private String 	namefahrer;
	private String 	kennzeichen;
	private int 	nummmer;

	public Taxi(String namefahrer,String kennzeichen,int nummmer){
		this.namefahrer = namefahrer;
		this.kennzeichen = kennzeichen;
		this.nummmer = nummmer;
	}
	public String fahrer(){
		return namefahrer;
	}
	public String kennzeichen(){
		return kennzeichen;
	}
	public int nummer(){
		return nummmer;
	}
}