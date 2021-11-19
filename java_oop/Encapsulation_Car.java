package java_oop;

public class Encapsulation_Car {
    private String madeBy;
    private String model;
    private int  year;

    public String getMadeBy() {
        return madeBy;
    }

    public void setMadeBy(String madeBy) {
        this.madeBy = madeBy;
    }

    public String getModel() { // this getter will help to get value of private variables and set will help to change and set value
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    Encapsulation_Car(String madeBy, String model, int year){
        this.madeBy = madeBy;
        this.model = model;
        this.year = year;

    }
}
