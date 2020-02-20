/*Dr.Frank viktor
2019
*/
public class VictorsArray {
 public static void main(String[] args) {
  String[] VictorsLieblingsObst = {
   "Birne",
   "Apfel",
   "Kiwi"
  };

  System.out.println(VictorsLieblingsObst[1]);
  //Der output ist "Apfel", da Arrays mit 0 starten

  int[] VictorsLieblingsZahlen = new int[7];
  //In Java sind leere Arrays mit 0 intialisiert
  VictorsLieblingsZahlen[0] = 7;
  //Das erste element wird zu 7 gesetzt

  for (int i = 1; i < VictorsLieblingsZahlen.length; i++) {
   VictorsLieblingsZahlen[i] = i + 3;
   //Auf alle Elemente des Arrays wird 3+ihren Index addiert
  }

  System.out.printf("%nVictors Lieblingszahlen: ");
  for (int each: VictorsLieblingsZahlen)
   System.out.print(each + " ");
  //Es werden die Array elemente(nicht das erste) mit leerzeichen dazwischen ausgegeben
  //7 1+3 2+3 3+3 4+3 5+3 6+3 oder ausgerechnet
  //"7 4 5 6 7 8 9 "

  int[] KohlsLieblingsZahlen = {
   2,
   5,
   58,
   4,
   3,
   444,
   25
  };
  VictorsLieblingsZahlen = KohlsLieblingsZahlen;
  // array VictorsLieblingsZahlen greift jetzt auf die gleichen elemente wie KohlsLieblingsZahlen zu
  //Die elemente werde NICHT kopiert
  VictorsLieblingsZahlen[1] = 100;
  //Ueber die Referenz wird auf das Element in KohlsLieblingsZahlen zu gegrifen

  System.out.printf("%nKohls Lieblingszahlen: ");
  for (int each: KohlsLieblingsZahlen)
   System.out.print(each + " ");
  //Der Output ist also:
  //"2 100 5 58 4 3 444 25 "
 }
}

