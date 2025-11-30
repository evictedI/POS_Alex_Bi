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
    public float sucheLaengsteEtappe() {
        float j = 0;

        for (int i = 0; i < etappen.length; i++) {
            for (int k = 0; k < etappen.length; k++) {
                if (etappen[i] != null && etappen[k] != null && (etappen[i].getLaenge()) > etappen[k].getLaenge()) {
                    j = etappen[i].getLaenge();
                }
            }
        }
        return j;
    }
}
