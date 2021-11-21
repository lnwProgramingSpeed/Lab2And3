package SecondHalf;

public class MyCar {
    public static void main(String[] arg) {
        CAR toyota = new CAR("red");
        CAR honda = new CAR("blue");

        // Toyota data object
        toyota.setSpeed(200);
        toyota.setMilage(1345);

        // Honda data object
        honda.setSpeed(300);
        honda.setMilage(8987);
        
        // Print
        System.out.println("Toyota color: " + toyota.getColor() + " speed: " + toyota.getSpeed() + " milage: "
                + toyota.getMilage());
        System.out.print(
                "Honda color: " + honda.getColor() + " speed: " + honda.getSpeed() + " milage: " + honda.getMilage());
    }
}
