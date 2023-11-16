package TPObserver;

public class Voiture implements IObserver {

    @Override
    public void update(String newState) {
        switch (newState) {
            case "rouge":
                System.out.println("La voiture s'arrête");
                break;
            case "orange":
                System.out.println("La voiture ralentie");
                break;
            case "vert":
                System.out.println("La voiture avance");
                break;
        }
    }
}
