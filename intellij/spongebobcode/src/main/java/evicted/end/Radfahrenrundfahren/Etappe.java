package evicted.end.Radfahrenrundfahren;

public class Etappe {
    private int nummer;
    private float laenge;
    private String zielort;
    private String sieger;
    private int stunden;
    private int minuten;

    public Etappe(float laenge, String zielort, String sieger, int stunden, int minuten) {
        this.setLaenge(laenge);
        this.setZielort(zielort);
        this.setSieger(sieger);
        this.setStunden(stunden);
        this.setMinuten(minuten);
    }

    public int getNummer() {
        return nummer;
    }

    public float getLaenge() {
        return laenge;
    }

    public String getZielort() {
        return zielort;
    }

    public String getSieger() {
        return sieger;
    }

    public int getStunden() {
        return stunden;
    }

    public int getMinuten() {
        return minuten;
    }

    public void setNummer(int nummer) {
        if(nummer <= 0) {
            throw new IllegalArgumentException("Darf nicht negativ sein!");
        }
        this.nummer = nummer;
    }



    public void setLaenge(float laenge) {
            if(laenge <= 0) {
                throw new IllegalArgumentException("Darf nicht negativ sein!");
            }
        this.laenge = laenge;
        }



    public void setZielort(String zielort) {
        if(zielort == null) {
            throw new IllegalArgumentException("Darf nicht null sein!");
        }
        this.zielort = zielort;
    }



    public void setSieger(String sieger) {
        if(sieger == null) {
            throw new IllegalArgumentException("Darf nicht null sein!");
        }
        this.sieger = sieger;
    }

    public void setStunden(int stunden){
        if (stunden < 0) {
            throw new IllegalArgumentException("Darf nicht negativ sein!");
        }
                    this.stunden = stunden;

                }

    public void setMinuten(int minuten){
        if (minuten < 0) {
            throw new IllegalArgumentException("Darf nicht negativ sein!");
        }
                        this.minuten = minuten;
                    }

    @Override
    public String toString() {
        return "Etappe{" +
                "nummer=" + nummer +
                ", laenge=" + laenge +
                ", Zielort='" + zielort + '\'' +
                ", Sieger='" + sieger + '\'' +
                ", stunden=" + stunden +
                ", minuten=" + minuten +
                '}';
    }
}
