import java.util.LinkedList;

public class Car {
    private final LinkedList<String> features;

    public Car() {
        this.features = new LinkedList<>();
    }

    public void addFeature(String feature) {
        features.add(feature);
    }

    public void showResult(){
        System.out.println("Car Features:");
        for (String feature : features) {
            System.out.println("- " + feature);
        }
    }

    }

