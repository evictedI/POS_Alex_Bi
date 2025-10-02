class Student {
    private String name;
    private char gender;
    private float kg;
    private float cm;
    public Student (String name, char gender, float cm, float kg, boolean isMale) {
        this.setName(name);
        this.setCm(cm);
        this.setKg(kg);
        if (isMale) {
            this.setGender('m');
        }
        else this.setGender('f');
    }
    public void setName (String name) {
        if (name.length() <= 2 ){
            throw new IllegalArgumentException("name needs to be longer than 2 characters");
        }
        else if(name.length() > 50){
            throw new IllegalArgumentException("name needs to be shorter than 50 characters");
        }
        this.name = name;
    }

    public void setGender (char gender) {
        if (gender != 'm' && gender != 'f') {
            throw new IllegalArgumentException("please either select m or f");
        }
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
        System.out.println("\n--- Result ---");
        System.out.println("Name: " + this.name);
        System.out.println("Weight: " + this.kg);
        System.out.println("Height: " + this.cm);
        System.out.println("Gender: " + mof());
        System.out.printf("BMI: ", BMIcalc());
        System.out.println("Bewertung: " + Result());
    }
}