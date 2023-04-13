public class Main {

    public static void main(String[] args) {

        Car mercedes = new Car();
        mercedes.type = "Mercedes";
        mercedes.model = "C200";
        mercedes.color = "Black";
        mercedes.year = 2018;
        mercedes.speed = 0;
        mercedes.increaseSpeed(50);
        mercedes.printSpeed();

    }
}
