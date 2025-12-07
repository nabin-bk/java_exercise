//Create a class `Car` with a parameterized constructor (model, year). Print the values...

public class Car {

Car(string model,int year){


   this.model = model;
    this.year = year;

}

    void display() {
        System.out.println(model + " " + year);
    }

    public static void main(String[] args) {
        Car c = new Car("toyota", 2025);
        c.display();
    }

    
}

