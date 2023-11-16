package TPObserver;

public class Velo implements IObserver {
    public void update(String newState) {
        switch (newState) {
            case "rouge":
                System.out.println("Le velo s'arrête");
                break;
            case "orange":
                System.out.println("Le velo ralentie");
                break;
            case "vert":
                System.out.println("Le velo avance");
                break;
        }
    }
}
