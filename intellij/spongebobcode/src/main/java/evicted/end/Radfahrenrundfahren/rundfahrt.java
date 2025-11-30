package evicted.end.Radfahrenrundfahren;

public class rundfahrt {
    private String name;
    private Etappe[] etappen;

    public rundfahrt(String name) {
        this.name = name;
        this.etappen = new  Etappe[50];

    }

    public void setEtappen(Etappe[] etappen) {
        this.etappen = etappen;
    }

    public void setName(String name) {
        this.name = name;
    }
    public  void position() {
        for (int i = 0; i < etappen.length; i++) {
            System.out.println(etappen[i]);
        }
    }
    public boolean hinzufuegen(Etappe jakob)
        {
            for (int i = 0; i < etappen.length; i++) {
                if (etappen[i] == jakob){
                    throw new IllegalArgumentException("is scho drinnen ");
                }
                if(etappen[i] == null){
                    jakob.setNummer(i+1);
                    etappen[i] = jakob;
                    return true;
                }
            }
        throw new IllegalArgumentException("FAHRT IST VOLL!!!!!!!!!!!!!!!!!!!!!");
    }
    public String etappenUebersicht() {
        String str = "";
        for (int i = 0; i < 50; i++) {
            if(etappen[i] != null) {
                str += etappen[i];
                str += "\n";
            }
        }
        return str;
    }
    public float berechneGesamtlaenge() {
        float j = 0;
        for (int i = 0; i < etappen.length; i++) {
            if(etappen[i] != null) {
                j += etappen[i].getLaenge();
            }
        }
        return j;
    }
    public float berechneDurchschnittslaenge() {
        int j = 0;
        for (int i = 0; i < etappen.length; i++) {
            if(etappen[i] != null) {
             j++;
            }
        }
        return berechneGesamtlaenge() / j;
    }
    public int anzGewonnen(String fahrer) {
        int j = 0;
        for (int i = 0; i < etappen.length; i++) {
            if (etappen[i] == null) {
                continue;
            }
            if (etappen[i].getSieger() == fahrer){
                j += 1;
            }
        }
    return j;
    }
    public float sucheLaengsteEtappe(){
        float rv = 0;
        for (int i = 0; i < etappen.length; i++) {
            for (int j = i+1; j < etappen.length; j++) {
                if (etappen[j] != null && rv < etappen[j].getLaenge())
                    rv = etappen[j].getLaenge();
            }
        }
        return rv;
    }
    public boolean annulieren(int pos) {
        for (int i = 0; i < etappen.length; i++) {
            if (etappen[i] == etappen[pos]) {
                etappen[i] = null;
                return true;
            }
        }
        return false;
    }
    public int berechneGesamtdauer() {
        int hour = 0;
        int minute = 0;
        for (int i = 0; i < etappen.length; i++) {
            if (etappen[i] != null) {
                hour += etappen[i].getStunden();
            }
            if(etappen[i] != null && etappen[i].getMinuten() > 30) {
                minute += etappen[i].getMinuten();
            }
        }
        return minute / 60 + hour;
    }
}
