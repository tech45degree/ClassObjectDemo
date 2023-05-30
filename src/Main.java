public class Main {
    public static void main(String[] args) {

        Car teslaModelX = new Car("Tesla Model X","SUV","Electric Engine",7,"Black");

        System.out.println(teslaModelX.toString());

        teslaModelX.makeNoise("vroooom");

        teslaModelX.repaint("Red");

        System.out.println(teslaModelX.toString());


        Car bmwM5 = new Car("BMW M5","Sedan","Fuel Engine",4,"Blue");

        System.out.println(bmwM5.toString());

        bmwM5.makeNoise("Vrrrrroooooooooooooooooooooooooooooom");

        bmwM5.repaint("Yellow");

        System.out.println(bmwM5.toString());



    }
}

