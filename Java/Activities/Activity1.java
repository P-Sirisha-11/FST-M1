public class Activity1 {

    public static void main(String[] args) {
        Car thar = new Car();
        thar.make = 2014;
        thar.color = "Black";
        thar.transmission = "Manual";
    
        
        thar.displayCharacterstics();
        thar.accelerate();
        thar.brake();
    }

}