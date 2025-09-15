class Student {
    private String name;
    private char gender;
    private float kg;
    private float cm;

    public Student (String name, char gender, float cm, float kg) {
        this.setName(name);
        this.setGender(gender);
        this.setCm(cm);
        this.setKg(kg);
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setGender (char gender) {
        this.gender = gender;
    }

    public void setKg (float kg) {
        this.kg = kg;
    }

    public void setCm (float cm) 
    {
        this.cm = cm;
    }

    public float BMIcalc(){
        float m = cm / 100;
        return ((this.kg) / (m * m));
    } 

    public String mof() {
        if(this.gender == 'm')
        {
            return "männlich";
        }
        else {
            return "weiblich";
        }    
    }

    public String Result() {
        float bmi = BMIcalc();
        if (gender == 'm')
        {
            if(bmi < 18.5) return "Underweight(man)";

            else if (bmi <= 24.9) return "Normalweight(man)";

            else return "Overweight(man)";
        }
        else if(gender == 'w') 
        {
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
        System.out.println("Geschlecht: " + mof());
        System.out.printf("BMI: ", BMIcalc());
        System.out.println("Bewertung: " + Result());
    }
}