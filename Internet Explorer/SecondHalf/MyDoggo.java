package SecondHalf;

public class MyDoggo {
    public static void main(String[] arg) {
        Doggo poodle = new Doggo("White", 15.5f);

        System.out.println("The color of my poodle is " + poodle.getColor());
        System.out.print("The weight of my dog is " + poodle.getWeight() + " KG");
    }
}
