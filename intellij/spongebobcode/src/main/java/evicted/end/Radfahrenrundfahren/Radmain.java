package evicted.end.Radfahrenrundfahren;

public class Radmain {
    public static void main(String[] args) {
        Etappe e1 = new Etappe(100,"wien", "Alex",1,20);
        Etappe e2 = new Etappe(200,"Warschau", "Dimitri",1,10);
        Etappe e3 = new Etappe(1000,"stblödsinn", "Alex",1,10);
        Etappe e4 = new Etappe(800,"Stockerau", "Alex",1,10);
        Etappe e5 = new Etappe(600,"obamna", "Alex",1,10);
        rundfahrt r1 = new rundfahrt("Dexter");
        r1.hinzufuegen(e1);r1.hinzufuegen(e2);
        r1.hinzufuegen(e3);
        r1.hinzufuegen(e4);
        r1.hinzufuegen(e5);
        r1.etappenUebersicht();
        System.out.println(r1.berechneGesamtlaenge());
        System.out.println(r1.berechneGesamtdauer());
    }
}
