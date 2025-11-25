class ettape {
    private String name;
    private double Laenge;
    private String Ziel;
    private String Sieger;
   public ettape(String name,double laenge,String Ziel, String Sieger)
   {
       this.name = name;
       this.Laenge = laenge;
       this.Ziel = Ziel;
       this.Sieger = Sieger;
   }

    public void setLaenge(double laenge) {
        Laenge = laenge;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setZiel(String ziel) {
        Ziel = ziel;
    }

    public void setSieger(String sieger) {
        Sieger = sieger;
    }
}