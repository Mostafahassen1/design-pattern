public class Main {
    public static void main(String[] args) {
        // Directly constructing a car without using Builder pattern
        Car myCar = new Car();

        // Adding features directly in the client code
        myCar.addFeature("Powerful Engine");
        myCar.addFeature("Alloy Wheels");
        myCar.addFeature("Leather Interior");

        // Displaying the features of the car
        myCar.showFeatures();
    }
}

                                          // We have the constructor and presentation in the same place. 
                                          // This violates the Single Responsibility Principle (SRP) and the Open/Closed Principle (OCP)
