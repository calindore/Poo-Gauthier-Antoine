package TPObserver;

public class Ambulance implements IObserver {
    @Override
    public void update(String newState) {
        switch (newState) {
            case "rouge":
                System.out.println("L'ambulance s'arrête");
                break;
            case "orange":
                System.out.println("L'ambulance ralentie");
                break;
            case "vert":
                System.out.println("L'ambulance avance");
                break;
        }
    }
}
