public class Person
{
    // Meine Variablen
    private String name;
    private double kg;
    private double cm;
    private int gebjahr;
    private char gender;

    //Student Objekt
    public Person(String name, int gebjahr,double kg, double cm, char gender){
        this.setName(name);
        this.setGebjahr(gebjahr);
        this.setKg(kg);
        this.setCm(cm);
        this.setGender(gender);
    }

    public Person(String name,boolean isMale,double cm, double kg){
        this.setName(name);
        this.setKg(kg);
        this.setCm(cm);
        if (isMale){
            this.setGender('m');
        }
        else this.setGender('f');
    }  

    //Die Setter
    private void setName(String name){
        // TODO: Seperate Meldung zu kurz oder zu lang
        if (name.length() < 3){
            throw new IllegalArgumentException("Name muss mind. 3 Buchstaben haben");
        }
        else if (name.length() > 50){
            throw new IllegalArgumentException("Name darf max 50 Buchstaben haben");
        }   
        this.name = name;
    }

    private void setGebjahr(int gebjahr){
        this.gebjahr = gebjahr;
    }

    private void setKg(double kilogramm){
        if (kilogramm > 635) {
            throw new IllegalArgumentException("Mehr als 635kg nicht möglich");
        } else if (kilogramm < 2) {
            throw new IllegalArgumentException("Weniger als 2kg nicht möglich");
        }
        this.kg = kilogramm;
    }

    private void setCm(double centimeter){
        if (centimeter > 250) {
            throw new IllegalArgumentException("Größer als 250cm ist nicht möglich");
        } else if (centimeter < 50) {
            throw new IllegalArgumentException("Kleiner als 54cm ist nicht möglich");
        }
        this.cm = centimeter;
    }

    private void setGender(char gender){
        gender = Character.toLowerCase(gender);
        if (gender != 'm' && gender != 'f'){
            throw new IllegalArgumentException("m oder f eingeben");
        }
        this.gender = gender;
    }

    //Print Student Info
    public void printPerson(){
        System.out.println("Name: " + this.name + " (Geb. " + this.gebjahr + ")");
        System.out.println("Gewicht: " + this.kg);
        System.out.println("Größe: " + this.cm);
        System.out.println("BMI: " + this.bmi_rechner());
        System.out.println("Dein Geschlecht: " + this.mannOderFrau());
        System.out.println("Du bist: " + this.bmi_werter());
    }
    //BMI Rechner
    private double bmi_rechner(){
        double cmInMetern = this.cm / 100.0f;
        double ergebnis = (this.kg / (cmInMetern*cmInMetern));
        return ergebnis;
    }
    //Test ob Mann oder Frau
    private String mannOderFrau(){
        if (this.gender == 'm'){
            return "Männlich";  
        }
        else if (this.gender == 'f'){
            return "Weiblich";
        }
        else throw new IllegalArgumentException("Geben Sie 'm' oder 'f' ein");
    }
    //BMI Schauen ob unter/über/normalgewicht
    public String bmi_werter(){
        int normal_max_m = 25;
        int normal_min_m = 20;
        int normal_max_f = 24;
        int normal_min_f = 19;
        double bmi = this.bmi_rechner();
        if (gender == 'm'){
            if (bmi < normal_min_m){
                return "Untergewicht";
            }
            else if (bmi > normal_max_m){
                return "Übergewicht";
            }
            else return "Normal";
        }
        else if (gender == 'f'){
            if (bmi < normal_min_f){
                return "Untergewicht";
            }
            else if (bmi > normal_max_f){
                return "Übergewicht";
            }
            else return "Normal";
        }
        else return "Error";
    }

    public String getName() {
        return name;
    }

    public double getGewicht(){
        return kg;
    }

    public double getCm(){
        return cm;
    }
}