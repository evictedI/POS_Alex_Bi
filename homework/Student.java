class Student {
    private String name;
    private String gender;
    private float kg;
    private float cm;

    public Student (String name, String gender) {
        this.name = name;
        this.gender = gender;
    }
        public void Set (float kg, float cm, String name, String gender) {
    this.kg = kg;
    this.cm = cm;
    this.name = name;
    this.gender = gender;
    }
    public Student() {
    this.name = "Joe";
    this.gender = "m";
    this.kg = 50;
    this.cm = 170;
    }
    
    public float BMIcalc(){
    float m = cm / 100;
    return ((this.kg) / (m * m));
    }
    public String Result() {
    float bmi = BMIcalc();
    if (gender.equals("m")){
        if(bmi < 18.5) return "Underweight(man)";
        else if (bmi <= 24.9) return "Normalweight(man)";
        else return "Overweight(man)";
    }
        else if(gender.equals("w")) {
        if(bmi < 18.5) return "underweight(woman)";
        else if(bmi <= 24.9) return "normalweight(woman)";
        else return "overweight(woman)";
        }
        else {
            return "unkown gender";
        }
    }
    public void printInfo() {
        System.out.println("\n--- Ergebnis ---");
        System.out.println("Name: " + name);
        System.out.println("Geschlecht: " + gender);
        System.out.printf("BMI: %.2f%n", BMIcalc());
        System.out.println("Bewertung: " + Result());
    }
}