class Car {
    String type;
    String model;
    String color;
    int year;
    int speed;

    void increaseSpeed(int increment) {
        if (speed + increment <= 200)
        speed += increment;
    }
    void  decreaseSpeed(int decrement) {
        if (speed - decrement >= 0)
        speed -= decrement;
    }
    void  printSpeed() {
        System.out.println("Speed: " + speed);
    }
}


